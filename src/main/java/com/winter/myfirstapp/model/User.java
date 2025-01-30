package com.winter.myfirstapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")  // Maps to the "users" table in PostgreSQL
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment ID
    private Long id;

    @Column(nullable = false)  // Name cannot be null
    private String name;

    @Column(unique = true, nullable = false)  // Email must be unique
    private String email;

    // Default constructor
    public User() {}

    // Constructor with fields
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}