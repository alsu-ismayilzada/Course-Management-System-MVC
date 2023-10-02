package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {

    void add(Student student);

    Student getById(int id);

    List<Student> getAll();

    void deleteById(int id);
}
