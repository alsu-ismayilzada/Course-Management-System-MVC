package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Override
    public void add(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
