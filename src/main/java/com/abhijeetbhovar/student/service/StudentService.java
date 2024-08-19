package com.abhijeetbhovar.student.service;

import com.abhijeetbhovar.student.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
