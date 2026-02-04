package com.ia.management.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "subjects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String code; // e.g., 20SC01T

    @Column(nullable = false)
    private String name; // e.g., Engineering Maths-II

    private String department; // "CS"
    private String semester; // "2nd"

    // Configuration for Max Marks
    private Integer co1MaxMarks; // e.g., 35
    private Integer co2MaxMarks; // e.g., 15
    private Integer totalMaxMarks; // e.g., 50

    // Type
    private String type; // "Theory" or "Lab"
}
