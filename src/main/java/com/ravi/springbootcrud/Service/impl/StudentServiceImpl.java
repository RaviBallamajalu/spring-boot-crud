package com.ravi.springbootcrud.Service.impl;

import com.ravi.springbootcrud.Service.StudentService;
import com.ravi.springbootcrud.entity.Student;
import com.ravi.springbootcrud.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public void addNewStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(Integer id) {
        Optional<Student> student = studentRepository.findById(id);
        log.info("Hello");
        return student.get();
    }

    @Override
    public void deleteById(Integer id) {
        Optional<Student> student = studentRepository.findById(id);
        studentRepository.deleteById(id);

    }
}
