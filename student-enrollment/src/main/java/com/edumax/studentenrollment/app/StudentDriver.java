package com.edumax.studentenrollment.app;

import com.edumax.studentenrollment.dao.StudentDao;
import com.edumax.studentenrollment.entity.Student;

import java.util.List;

public class StudentDriver {

    public static void main(String[] args) {

        StudentDao dao = new StudentDao();

        // CREATE
         dao.addStudent(new Student(1, "John Doe", "Computer Science", "john@example.com", "A"));

        // READ by ID
        Student student = dao.getStudentById(1);
        if (student != null) {
            System.out.println("Found Student: " + student.getName() + ", Course: " + student.getCourse() + ", Email: " + student.getEmail());
        } else {
            System.out.println("No student found with given ID");
        }

        // UPDATE
        if (student != null) {
            student.setGrade("A+");
            dao.updateStudent(student);
        }

        // READ all
        List<Student> students = dao.getAllStudents();
        System.out.println("\nAll Students in DB:");
        for (Student s : students) {
            System.out.println(s.getStudentId() + " | " + s.getName() + " | " + s.getCourse() + " | " + s.getEmail() + " | " + s.getGrade());
        }

        // DELETE
        // dao.deleteStudent(1);

        dao.close();
    }
}
