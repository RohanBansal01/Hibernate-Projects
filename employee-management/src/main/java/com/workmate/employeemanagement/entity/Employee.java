package com.workmate.employeemanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    private int empId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "salary")
    private double salary;

    @Column(name = "designation")
    private String designation;

    public Employee() {
    }

    public Employee(int empId, String name, String department, double salary, String designation) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    // Getters and Setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
