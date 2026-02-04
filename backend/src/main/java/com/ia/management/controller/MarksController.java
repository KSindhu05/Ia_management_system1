package com.ia.management.controller;

import com.ia.management.model.IAMark;
import com.ia.management.model.Student;
import com.ia.management.model.Subject;
import com.ia.management.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/marks")
@CrossOrigin(origins = "http://localhost:3000")
public class MarksController {

    @Autowired
    private MarksService marksService;

    @GetMapping("/subjects")
    public List<Subject> getSubjects() {
        return marksService.getAllSubjects();
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return marksService.getAllStudents();
    }

    @GetMapping("/subject/{subjectId}")
    public List<IAMark> getMarksForSubject(@PathVariable Long subjectId) {
        return marksService.getMarksForSubject(subjectId);
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateMark(@RequestBody Map<String, Object> payload) {
        try {
            Long studentId = Long.valueOf(payload.get("studentId").toString());
            Long subjectId = Long.valueOf(payload.get("subjectId").toString());
            String iaType = (String) payload.get("iaType");

            Double co1 = payload.get("co1") != null ? Double.valueOf(payload.get("co1").toString()) : 0.0;
            Double co2 = payload.get("co2") != null ? Double.valueOf(payload.get("co2").toString()) : 0.0;

            IAMark updated = marksService.updateMark(studentId, subjectId, iaType, co1, co2);
            return ResponseEntity.ok(updated);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error updating mark: " + e.getMessage());
        }
    }
}
