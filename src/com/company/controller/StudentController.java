package com.company.controller;

import com.company.model.Student;
import com.company.service.StudentService;

import java.util.List;

public class StudentController {
    StudentService studentService = new StudentService();
    public void createStudent(Student student){
        studentService.save(student);
    }
    public List<Student> showListStudent(){
        return studentService.findAll();
    }
}
