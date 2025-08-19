package com.edumax.studentenrollment.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_table")
public class Student {

    @Id
    private int studentId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "course", nullable = false)
    private String course;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "grade")
    private String grade;

    public Student() {
    }

    public Student(int studentId, String name, String course, String email, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.email = email;
        this.grade = grade;
    }

    // Getters and Setters

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
