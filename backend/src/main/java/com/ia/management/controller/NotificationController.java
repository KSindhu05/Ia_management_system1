package com.ia.management.controller;

import com.ia.management.model.Notification;
import com.ia.management.model.User;
import com.ia.management.repository.UserRepository;
import com.ia.management.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/notifications")
@CrossOrigin(origins = "*") 
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private UserRepository userRepository;

    private User getAuthenticatedUser(Principal principal) {
        if (principal == null) return null;
        return userRepository.findByUsername(principal.getName()).orElse(null);
    }

    // Get My Notifications
    @GetMapping
    public ResponseEntity<List<Notification>> getMyNotifications(Principal principal) {
        if (principal == null) return ResponseEntity.status(401).build();
        return ResponseEntity.ok(notificationService.getUserNotifications(principal.getName()));
    }

    // Mark as Read
    @PostMapping("/{id}/read")
    public ResponseEntity<?> markAsRead(@PathVariable Long id) {
        notificationService.markAsRead(id);
        return ResponseEntity.ok().build();
    }

    // Broadcast (HOD ONLY)
    @PostMapping("/broadcast")
    public ResponseEntity<?> sendBroadcast(@RequestBody Map<String, String> payload, Principal principal) {
        User user = getAuthenticatedUser(principal);
        if (user == null || user.getRole() != User.Role.HOD) {
            return ResponseEntity.status(403).body("Only HOD can send broadcasts");
        }

        String message = payload.get("message");
        String department = payload.get("department") != null ? payload.get("department") : "CS"; // Default or from user

        if (message == null || message.trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Message is required");
        }

        notificationService.createBroadcast(department, message, user);
        return ResponseEntity.ok("Broadcast sent successfully");
    }
}
