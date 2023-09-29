package com.example.demo.service.impl;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service@AllArgsConstructor
public class TeacherImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    @Override
    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteById(int id) {
        teacherRepository.deleteById(id);

    }

    @Override
    public Teacher getById(int id) {
        return teacherRepository.findById(id).get();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }
}
