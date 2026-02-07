package com.ia.management.model;

import java.util.List;

/**
 * DTO for aggregating pending mark submissions for HOD approval
 */
public class PendingApprovalDTO {
    private Long subjectId;
    private String subjectName;
    private String subjectCode;
    private String iaType;
    private String facultyName;
    private int studentCount;
    private String submittedDate;
    private List<StudentMarkDTO> marks;

    public PendingApprovalDTO() {}

    public PendingApprovalDTO(Long subjectId, String subjectName, String subjectCode, String iaType, String facultyName, int studentCount, String submittedDate, List<StudentMarkDTO> marks) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.iaType = iaType;
        this.facultyName = facultyName;
        this.studentCount = studentCount;
        this.submittedDate = submittedDate;
        this.marks = marks;
    }

    public Long getSubjectId() { return subjectId; }
    public void setSubjectId(Long subjectId) { this.subjectId = subjectId; }
    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }
    public String getSubjectCode() { return subjectCode; }
    public void setSubjectCode(String subjectCode) { this.subjectCode = subjectCode; }
    public String getIaType() { return iaType; }
    public void setIaType(String iaType) { this.iaType = iaType; }
    public String getFacultyName() { return facultyName; }
    public void setFacultyName(String facultyName) { this.facultyName = facultyName; }
    public int getStudentCount() { return studentCount; }
    public void setStudentCount(int studentCount) { this.studentCount = studentCount; }
    public String getSubmittedDate() { return submittedDate; }
    public void setSubmittedDate(String submittedDate) { this.submittedDate = submittedDate; }
    public List<StudentMarkDTO> getMarks() { return marks; }
    public void setMarks(List<StudentMarkDTO> marks) { this.marks = marks; }

    public static class StudentMarkDTO {
        private Long studentId;
        private String regNo;
        private String studentName;
        private Double totalScore;

        public StudentMarkDTO() {}

        public StudentMarkDTO(Long studentId, String regNo, String studentName, Double totalScore) {
            this.studentId = studentId;
            this.regNo = regNo;
            this.studentName = studentName;
            this.totalScore = totalScore;
        }

        public Long getStudentId() { return studentId; }
        public void setStudentId(Long studentId) { this.studentId = studentId; }
        public String getRegNo() { return regNo; }
        public void setRegNo(String regNo) { this.regNo = regNo; }
        public String getStudentName() { return studentName; }
        public void setStudentName(String studentName) { this.studentName = studentName; }
        public Double getTotalScore() { return totalScore; }
        public void setTotalScore(Double totalScore) { this.totalScore = totalScore; }
    }
}
