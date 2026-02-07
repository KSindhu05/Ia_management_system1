package com.ia.management.repository;

import com.ia.management.model.CIEAnnouncement;
import com.ia.management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface CIEAnnouncementRepository extends JpaRepository<CIEAnnouncement, Long> {
        List<CIEAnnouncement> findByFaculty(User faculty);

        List<CIEAnnouncement> findBySubject_IdInAndScheduledDateAfterOrderByScheduledDateAsc(List<Long> subjectIds,
                        LocalDate date);

        List<CIEAnnouncement> findBySubject_DepartmentAndScheduledDateAfterOrderByScheduledDateAsc(String department,
                        LocalDate date);

        Optional<CIEAnnouncement> findBySubjectIdAndCieNumber(Long subjectId, Integer cieNumber);

        CIEAnnouncement findFirstBySubjectIdAndScheduledDateGreaterThanEqualOrderByScheduledDateAsc(Long subjectId,
                        LocalDate date);
}
