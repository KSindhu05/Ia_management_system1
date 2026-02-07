package com.ia.management.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cie_marks")
public class CIEMark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @Enumerated(EnumType.STRING)
    private CIEType cieType;

    private Double co1Score;
    private Double co2Score;
    private Double totalScore;
    private Integer attendancePercentage;
    private String remarks;

    @Enumerated(EnumType.STRING)
    private MarkStatus status = MarkStatus.PENDING;

    public CIEMark() {}

    public CIEMark(Long id, Student student, Subject subject, CIEType cieType, Double co1Score, Double co2Score, Double totalScore, Integer attendancePercentage, String remarks, MarkStatus status) {
        this.id = id;
        this.student = student;
        this.subject = subject;
        this.cieType = cieType;
        this.co1Score = co1Score;
        this.co2Score = co2Score;
        this.totalScore = totalScore;
        this.attendancePercentage = attendancePercentage;
        this.remarks = remarks;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public CIEType getCieType() { return cieType; }
    public void setCieType(CIEType cieType) { this.cieType = cieType; }

    public Double getCo1Score() { return co1Score; }
    public void setCo1Score(Double co1Score) { this.co1Score = co1Score; }

    public Double getCo2Score() { return co2Score; }
    public void setCo2Score(Double co2Score) { this.co2Score = co2Score; }

    public Double getTotalScore() { return totalScore; }
    public void setTotalScore(Double totalScore) { this.totalScore = totalScore; }

    public Integer getAttendancePercentage() { return attendancePercentage; }
    public void setAttendancePercentage(Integer attendancePercentage) { this.attendancePercentage = attendancePercentage; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }

    public MarkStatus getStatus() { return status; }
    public void setStatus(MarkStatus status) { this.status = status; }

    public enum CIEType {
        CIE1, CIE2, CIE3, CIE4, CIE5
    }

    public enum MarkStatus {
        PENDING, SUBMITTED, APPROVED, REJECTED
    }
}
