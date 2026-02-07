package com.ia.management.controller;

import com.ia.management.model.CIEAnnouncement;
import com.ia.management.model.Notification;
import com.ia.management.model.Student;
import com.ia.management.model.User;
import com.ia.management.repository.StudentRepository;
import com.ia.management.repository.SubjectRepository;
import com.ia.management.repository.UserRepository;
import com.ia.management.service.CIEAnnouncementService;
import com.ia.management.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cie")
@CrossOrigin(origins = "*")
public class CIEAnnouncementController {

    @Autowired
    private CIEAnnouncementService announcementService;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    // --- FACULTY ENDPOINTS ---

    @PostMapping("/faculty/announcements")
    public ResponseEntity<CIEAnnouncement> createAnnouncement(
            @RequestParam Long subjectId,
            @RequestBody CIEAnnouncement announcement,
            Authentication authentication) {
        return ResponseEntity
                .ok(announcementService.createAnnouncement(subjectId, authentication.getName(), announcement));
    }

    @GetMapping("/faculty/announcements/details")
    public ResponseEntity<CIEAnnouncement> getAnnouncementDetails(
            @RequestParam Long subjectId,
            @RequestParam Integer cieNumber) {
        return ResponseEntity.ok(announcementService.getAnnouncementDetails(subjectId, cieNumber));
    }

    @GetMapping("/faculty/announcements")
    public ResponseEntity<List<CIEAnnouncement>> getMyAnnouncements(Authentication authentication) {
        return ResponseEntity.ok(announcementService.getFacultyAnnouncements(authentication.getName()));
    }

    @GetMapping("/faculty/announcements/upcoming")
    public ResponseEntity<CIEAnnouncement> getUpcomingAnnouncement(@RequestParam Long subjectId) {
        CIEAnnouncement announcement = announcementService.getUpcomingAnnouncement(subjectId);
        if (announcement != null) {
            return ResponseEntity.ok(announcement);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    // --- STUDENT ENDPOINTS ---

    @GetMapping("/student/announcements")
    public ResponseEntity<List<CIEAnnouncement>> getStudentAnnouncements(Authentication authentication) {
        // 1. Get Student Profile
        User user = userRepository.findByUsername(authentication.getName()).orElseThrow();
        Student student = studentRepository.findByRegNo(user.getAssociatedId()).orElseThrow();

        // 2. Find Subjects for Student (Dept + Sem)
        List<Long> subjectIds = subjectRepository
                .findByDepartmentAndSemester(student.getDepartment(), student.getSemester())
                .stream().map(s -> s.getId()).collect(Collectors.toList());

        // 3. Find Announcements
        return ResponseEntity.ok(announcementService.getAnnouncementsForSubjects(subjectIds));
    }

    @GetMapping("/student/notifications")
    public ResponseEntity<List<Notification>> getNotifications(Authentication authentication) {
        return ResponseEntity.ok(notificationService.getUserNotifications(authentication.getName()));
    }

    @PutMapping("/notifications/{id}/read")
    public ResponseEntity<Void> markAsRead(@PathVariable Long id) {
        notificationService.markAsRead(id);
        return ResponseEntity.ok().build();
    }

    // --- HOD ENDPOINTS ---

    @GetMapping("/hod/announcements")
    public ResponseEntity<List<CIEAnnouncement>> getDepartmentAnnouncements(Authentication authentication) {
        User user = userRepository.findByUsername(authentication.getName()).orElseThrow();
        // HOD associatedId stores Department Name or Department field
        String department = user.getDepartment();
        if (department == null)
            department = user.getAssociatedId(); // Fallback

        return ResponseEntity.ok(announcementService.getDepartmentAnnouncements(department));
    }

    @PostMapping("/hod/announcements")
    public ResponseEntity<CIEAnnouncement> createHODAnnouncement(
            @RequestParam Long subjectId,
            @RequestBody CIEAnnouncement announcement,
            Authentication authentication) {
        return ResponseEntity
                .ok(announcementService.createAnnouncement(subjectId, authentication.getName(), announcement));
    }
}
