package com.ravi.springbootcrud.Service;

import com.ravi.springbootcrud.entity.Student;

public interface StudentService {
    void addNewStudent(Student student);

    Student findById(Integer id);

    void deleteById(Integer id);
}
