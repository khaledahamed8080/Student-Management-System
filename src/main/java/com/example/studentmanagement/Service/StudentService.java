package com.example.studentmanagement.Service;

import java.util.List;

import com.example.studentmanagement.Model.Student;

public interface StudentService {
    List<Student> getallStudents();
    void saveStudent(Student student);
    Student getstudentById(Long id);
    void deletestudentById(Long id);
}
