package com.example.studentmanagement.Service;

import java.util.List;
import java.util.Optional;

import com.example.studentmanagement.StudentManagementApplication;
import com.example.studentmanagement.Model.Student;
import com.example.studentmanagement.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getallStudents() {
     return  studentRepository.findAll();
    } 
    @Override
    public void saveStudent(Student student) {
    this.studentRepository.save(student);
        
    }
    @Override
    public Student getstudentById(Long id) {
       Optional<Student> optional =studentRepository.findById(id);
       Student student =null;
       if(optional.isPresent()){
           student=optional.get();
       }else{
        throw new RuntimeException("Student not present"+id);
       }
        return student;
    }
    @Override
    public void deletestudentById(Long id) {
        this.studentRepository.deleteById(id);
        
    }
}
