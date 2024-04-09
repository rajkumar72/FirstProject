package com.student;

import java.util.Arrays;
import java.util.Scanner;

public class Console {
    Scanner scn=new Scanner(System.in);
    ClassRoom classRoom=new ClassRoom();
    public int Start() {

        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Manage Student");
        System.out.println("0. Exit");
        System.out.println("Enter your option : ");

        int choice=scn.nextInt();
        scn.nextLine();

        switch(choice) {
            case 1:
                AddStudent();
                return choice;

            case 2:
                RemoveStudent();
                return choice;

            case 3:
                DispalyClassroom();
                return choice;

            default:
                return 0;
        }

    }

    private void RemoveStudent() {
        System.out.println("Enter the student Roll No to be removed :-");
        System.out.println("Roll No : ");
        int rollNo=scn.nextInt();
        scn.nextLine();

        classRoom.RemoveStudent(rollNo);
    }

    private void DispalyClassroom() {

        for(Student student : classRoom.students)
        {
            System.out.println("Name : " + student.getName());
            System.out.println("Roll no : " + student.getRollNo());
            System.out.println("Marks : " + Arrays.toString(student.getMarks()));
        }

    }

    private void AddStudent() {
        System.out.println("Enter the student details :-");
        System.out.println("Name : ");
        String name=scn.nextLine();
        System.out.println("Roll No : ");
        int rollNo=scn.nextInt();

        System.out.println("Enter the marks for 5 subjects : ");

        int[] marks=new int[5];
        for(int i = 0; i<5; i++)
        {
            marks[i]=scn.nextInt();
        }
        scn.nextLine();
        classRoom.AddStudent(new Student(name,rollNo,marks));
    }

}
