package com.ia.management.config;

import com.ia.management.model.Student;
import com.ia.management.model.Subject;
import com.ia.management.repository.StudentRepository;
import com.ia.management.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public void run(String... args) throws Exception {
        if (subjectRepository.count() == 0) {
            System.out.println("Seeding Subjects...");

            // Real Sheet Config
            // 1. Engineering Maths-II: CO1=35, CO2=15, Total=50
            Subject maths = new Subject(null, "20SC01T", "Engineering Maths-II", "CS", "2nd", 35, 15, 50, "Theory");

            // 2. English Communication: CO1=50, CO2=0, Total=50
            Subject english = new Subject(null, "20EG01T", "English Communication", "CS", "2nd", 50, 0, 50, "Theory");

            // 3. CAEG: CO1=8, CO2=22, Total=30
            Subject caeg = new Subject(null, "20CS21P", "CAEG", "CS", "2nd", 8, 22, 30, "Lab");

            // 4. Python: CO1=25, CO2=0, Total=25? Sheet says 25.
            Subject python = new Subject(null, "20CS22P", "Python", "CS", "2nd", 25, 0, 25, "Lab");

            subjectRepository.saveAll(Arrays.asList(maths, english, caeg, python));
        }

        if (studentRepository.count() == 0) {
            System.out.println("Seeding Students...");
            // Seed a few students from the list (Adding more is just expanding this list)
            List<Student> students = Arrays.asList(
                    new Student(null, "459CS25001", "A KAVITHA", "CS", "2nd", "A", "9071407865", null),
                    new Student(null, "459CS25002", "ABHISHEKA", "CS", "2nd", "A", "8197870656", null),
                    new Student(null, "459CS25003", "ADARSH REDDY G", "CS", "2nd", "A", "9182990109", null),
                    new Student(null, "459CS25004", "AGASARA KEERTHANA", "CS", "2nd", "A", "9398963460", null),
                    new Student(null, "459CS25005", "AKHIL S", "CS", "2nd", "A", "8861821741", null));

            studentRepository.saveAll(students);
        }
    }
}
