package com.company.service;

import com.company.model.Student;

import java.util.List;

public interface IStudenService {
    void save(Student student);
    List<Student> findAll();
}
