package com.company.view;

import com.company.controller.StudentController;
import com.company.model.Student;

import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();

    public void formCreateStudent(){
        boolean checkCreate = true;
        while (checkCreate){
            System.out.println("Nhập vào số thứ tự của học viên: ");
            int id = scanner.nextInt();
            System.out.println("Nhập vào tên của học viên");
            String name = scanner.next();
            Student student = new Student(id, name);
            studentController.createStudent(student);
            System.out.println("Nhập một phím bất kì để tạo dữ liệu tiếp - Nhập QUIT để thoát khỏi chương trình");
            String enterOrQuit = scanner.next();
            if(enterOrQuit.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
    public void manageStudentList(){
        System.out.println("STT---NAME");
        System.out.println("Size == "+studentController.showListStudent().size());
        for(int i=0; i<studentController.showListStudent().size();i++){
            System.out.println(" "+studentController.showListStudent().get(i).getId()
            +"   "+studentController.showListStudent().get(i).getName());

        }
        String enterOrQuit = scanner.next();
        if(enterOrQuit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
