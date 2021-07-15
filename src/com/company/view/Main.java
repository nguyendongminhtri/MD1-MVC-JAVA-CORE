package com.company.view;

import java.util.Scanner;

public class Main {
Scanner scanner = new Scanner(System.in);
StudentView studentView = new StudentView();
    public Main() {
        System.out.println("MENU MANAGE STUDENT");
        System.out.println("1.Create Student\n2.Show List Student");
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu){
            case 1:
                studentView.formCreateStudent();
                break;
            case 2:
                studentView.manageStudentList();
                break;
        }
    }

    public static void main(String[] args) {
        new Main();
	// write your code here
    }
}
