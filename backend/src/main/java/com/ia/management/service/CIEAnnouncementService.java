package com.ia.management.service;

import com.ia.management.model.CIEAnnouncement;
import com.ia.management.model.Subject;
import com.ia.management.model.User;
import com.ia.management.repository.CIEAnnouncementRepository;
import com.ia.management.repository.SubjectRepository;
import com.ia.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CIEAnnouncementService {

    @Autowired
    private CIEAnnouncementRepository cieRepository;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Transactional
    public CIEAnnouncement createAnnouncement(Long subjectId, String username, CIEAnnouncement announcement) {
        User faculty = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        Subject subject = subjectRepository.findById(subjectId)
                .orElseThrow(() -> new RuntimeException("Subject not found"));

        // Check if announcement already exists for this Subject + CIE
        CIEAnnouncement existing = cieRepository.findBySubjectIdAndCieNumber(subjectId, announcement.getCieNumber())
                .orElse(null);

        if (existing != null) {
            boolean syllabusChanged = (announcement.getSyllabusCoverage() != null
                    && !announcement.getSyllabusCoverage().equals(existing.getSyllabusCoverage()))
                    || (announcement.getInstructions() != null
                            && !announcement.getInstructions().equals(existing.getInstructions()));

            // Update fields
            if (announcement.getScheduledDate() != null)
                existing.setScheduledDate(announcement.getScheduledDate());
            if (announcement.getDurationMinutes() != null)
                existing.setDurationMinutes(announcement.getDurationMinutes());
            if (announcement.getSyllabusCoverage() != null && !announcement.getSyllabusCoverage().isEmpty())
                existing.setSyllabusCoverage(announcement.getSyllabusCoverage());
            if (announcement.getInstructions() != null)
                existing.setInstructions(announcement.getInstructions());
            if (announcement.getExamRoom() != null)
                existing.setExamRoom(announcement.getExamRoom());
            if (announcement.getStartTime() != null)
                existing.setStartTime(announcement.getStartTime());

            CIEAnnouncement saved = cieRepository.save(existing);

            if (syllabusChanged) {
                notificationService.notifySyllabusUpdated(saved);
            }

            return saved;
        }

        announcement.setFaculty(faculty);
        announcement.setSubject(subject);

        CIEAnnouncement saved = cieRepository.save(announcement);

        // Broadcast notifications
        notificationService.notifyStudents(saved);
        notificationService.notifyHOD(saved);

        return saved;
    }

    public CIEAnnouncement getAnnouncementDetails(Long subjectId, Integer cieNumber) {
        return cieRepository.findBySubjectIdAndCieNumber(subjectId, cieNumber)
                .orElse(null);
    }

    public List<CIEAnnouncement> getFacultyAnnouncements(String username) {
        User faculty = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return cieRepository.findByFaculty(faculty);
    }

    public List<CIEAnnouncement> getStudentAnnouncements(String username) {
        // Find student subjects
        // Simplified: Fetch based on Dept/Sem matching student
        // Real implementation should check enrollment
        // But for now, we find all active announcements for the student's dept/sem

        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        // Need to find Student profile to get Dept/Sem
        // Assuming associatedId is RegNo, find student
        // Or simpler: We don't have direct access here without StudentRepo dependency
        // or adding it to User

        // Let's rely on Subject IDs.
        // Logic: Find IDs of subjects relevant to student
        // This part needs StudentRepository access.
        // For now returning empty or handling logic in Controller where we have access
        return List.of();
    }

    public List<CIEAnnouncement> getAnnouncementsForSubjects(List<Long> subjectIds) {
        return cieRepository.findBySubject_IdInAndScheduledDateAfterOrderByScheduledDateAsc(subjectIds,
                LocalDate.now().minusDays(1));
    }

    public List<CIEAnnouncement> getDepartmentAnnouncements(String department) {
        return cieRepository.findBySubject_DepartmentAndScheduledDateAfterOrderByScheduledDateAsc(department,
                LocalDate.now().minusDays(1));
    }

    public CIEAnnouncement getUpcomingAnnouncement(Long subjectId) {
        // Return the first announcement scheduled for today or future
        return cieRepository.findFirstBySubjectIdAndScheduledDateGreaterThanEqualOrderByScheduledDateAsc(subjectId,
                LocalDate.now());
    }
}
