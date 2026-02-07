package com.ia.management.model;

import java.util.List;

public class FacultyDTO {
    private Long id;
    private String username;
    private String fullName;
    private String department;
    private String designation;
    private List<String> subjects;
    private String email;

    public FacultyDTO() {}

    public FacultyDTO(Long id, String username, String fullName, String department, String designation, List<String> subjects, String email) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.designation = designation;
        this.subjects = subjects;
        this.email = email;
    }

    public static FacultyDTOBuilder builder() { return new FacultyDTOBuilder(); }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public List<String> getSubjects() { return subjects; }
    public void setSubjects(List<String> subjects) { this.subjects = subjects; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public static class FacultyDTOBuilder {
        private Long id;
        private String username;
        private String fullName;
        private String department;
        private String designation;
        private List<String> subjects;
        private String email;

        public FacultyDTOBuilder id(Long id) { this.id = id; return this; }
        public FacultyDTOBuilder username(String username) { this.username = username; return this; }
        public FacultyDTOBuilder fullName(String fullName) { this.fullName = fullName; return this; }
        public FacultyDTOBuilder department(String department) { this.department = department; return this; }
        public FacultyDTOBuilder designation(String designation) { this.designation = designation; return this; }
        public FacultyDTOBuilder subjects(List<String> subjects) { this.subjects = subjects; return this; }
        public FacultyDTOBuilder email(String email) { this.email = email; return this; }
        public FacultyDTO build() { return new FacultyDTO(id, username, fullName, department, designation, subjects, email); }
    }
}
