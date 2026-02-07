package com.ia.management.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    private String associatedId;
    private String department;
    private String fullName;
    private String email;

    public User() {}

    public User(Long id, String username, String password, Role role, String associatedId, String department, String fullName, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.associatedId = associatedId;
        this.department = department;
        this.fullName = fullName;
        this.email = email;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public String getAssociatedId() { return associatedId; }
    public void setAssociatedId(String associatedId) { this.associatedId = associatedId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public enum Role {
        STUDENT,
        FACULTY,
        HOD,
        PRINCIPAL
    }
}
