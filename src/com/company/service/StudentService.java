package com.company.service;

import com.company.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudenService{
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "Thản"));
        studentList.add(new Student(2, "Văn"));
        studentList.add(new Student(3, "Trung"));
    }
    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
