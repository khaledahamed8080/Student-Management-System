package com.example.studentmanagement.Controller;

import com.example.studentmanagement.Model.Student;
import com.example.studentmanagement.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    
     @GetMapping("/")
    public String getstudents( Model model){
    model.addAttribute("Liststudents", studentService.getallStudents());
    return "index";
    }
    @GetMapping("/showNewStudentForm")
    public String showNewStudentForm( Model model){
       Student student=new Student();
       model.addAttribute("student", student);
      return "new_student";

    }
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute ("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/"; 
    }
    @GetMapping("/UpdateForm/{id}")
    public String UpdateForm(@PathVariable(value="id") Long id, Model model){
        Student student=studentService.getstudentById(id);
        model.addAttribute("student", student);
        return "update_student";
    }
    @GetMapping("/DeleteForm/{id}") 
    public String DeleteForm(@PathVariable(value="id") Long id){
        this.studentService.deletestudentById(id);
        return "redirect:/";
    }
}
