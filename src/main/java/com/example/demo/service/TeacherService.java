package com.example.demo.service;

import com.example.demo.entity.Teacher;

import java.util.List;

public interface TeacherService {

    void addTeacher(Teacher teacher);
    void deleteById(int id);
    Teacher getById(int id);
    List<Teacher> getAll();
}
