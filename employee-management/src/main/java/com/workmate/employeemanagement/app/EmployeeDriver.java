package com.workmate.employeemanagement.app;

import com.workmate.employeemanagement.dao.EmployeeDao;
import com.workmate.employeemanagement.entity.Employee;

import java.util.List;

public class EmployeeDriver {

    public static void main(String[] args) {

        EmployeeDao dao = new EmployeeDao();

        // CREATE
         dao.addEmployee(new Employee(1, "Alice Smith", "HR", 55000, "Manager"));

        // READ by ID
        Employee emp = dao.getEmployeeById(1);
        if (emp != null) {
            System.out.println("Found Employee: " + emp.getName() + ", Department: " + emp.getDepartment() + ", Salary: " + emp.getSalary());
        } else {
            System.out.println("No employee found with given ID");
        }

        // UPDATE
        if (emp != null) {
            emp.setSalary(60000);
            emp.setDesignation("Senior Manager");
            dao.updateEmployee(emp);
        }

        // READ all
        List<Employee> employees = dao.getAllEmployees();
        System.out.println("\nAll Employees in DB:");
        for (Employee e : employees) {
            System.out.println(e.getEmpId() + " | " + e.getName() + " | " + e.getDepartment() + " | " + e.getSalary() + " | " + e.getDesignation());
        }

        // DELETE
        // dao.deleteEmployee(1);

        dao.close();
    }
}
