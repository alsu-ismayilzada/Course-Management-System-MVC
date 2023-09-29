package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;


public interface CourseService {

    void addCourse(Course course);
    void deleteById(int id);
    Course getById(int id);
    List<Course> getAll();
}
