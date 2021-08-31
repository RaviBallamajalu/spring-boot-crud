package com.ravi.springbootcrud.controller;

import com.ravi.springbootcrud.Service.StudentService;
import com.ravi.springbootcrud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/VCET")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){

        studentService.addNewStudent(student);

        return "SUCCES";
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable Integer id){
        Student student=studentService.findById(id);

        return student;
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteTheStudent(@PathVariable Integer id){
        studentService.deleteById(id);

        return "DELETE";
    }
}
