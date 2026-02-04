package com.ia.management.repository;

import com.ia.management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDepartmentAndSemesterAndSection(String department, String semester, String section);

    Optional<Student> findByRegNo(String regNo);
}
