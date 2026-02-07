package com.ia.management.service;

import com.ia.management.model.StudentDashboardData;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class StudentService {

        @org.springframework.beans.factory.annotation.Autowired
        private com.ia.management.repository.UserRepository userRepository;

        @org.springframework.beans.factory.annotation.Autowired
        private com.ia.management.repository.StudentRepository studentRepository;

        public StudentDashboardData getDashboardData(String username) {
                // 1. Fetch User Profile
                var user = userRepository.findByUsername(username)
                                .orElseThrow(() -> new RuntimeException("Student not found"));

                // Assuming associatedId is the RegNo
                var student = studentRepository.findByRegNo(user.getAssociatedId())
                                .orElse(null);

                var profile = StudentDashboardData.StudentProfile.builder()
                                .name(user.getFullName())
                                .rollNo(user.getAssociatedId())
                                .branch(student != null ? student.getDepartment() : "N/A")
                                .semester(student != null ? student.getSemester() : "N/A")
                                .attendance(78) // Mock for now
                                .cgpa(8.2) // Mock for now
                                .build();

                // 2. Marks - To be implemented with CIEMarkRepository
                var marks = Arrays.asList(
                                StudentDashboardData.CIEMark.builder().id(1).subject("Data Structures").code("CS301")
                                                .cie1(0).cie2(0).cie3(0).avg(0).status("Pending").build());

                // 3. Exams - To be implemented with CIEAnnouncementRepository
                var exams = Arrays.asList(
                                StudentDashboardData.Exam.builder().id(1).exam("No Upcoming Exams").subject("")
                                                .date("-").time("-").build());

                // 4. Notifications & Achievements - Mock for now
                var notifications = Arrays.asList(
                                StudentDashboardData.Notification.builder().id(1)
                                                .message("Welcome to IA Management System").time("Just now")
                                                .type("info").build());

                var achievements = Arrays.asList(
                                StudentDashboardData.Achievement.builder().id(1).title("Student").desc("Active")
                                                .icon("🎓").build());

                return StudentDashboardData.builder()
                                .profile(profile)
                                .marks(marks)
                                .upcomingExams(exams)
                                .notifications(notifications)
                                .achievements(achievements)
                                .build();
        }
}
