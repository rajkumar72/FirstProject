package com.student;

import java.util.ArrayList;

public class ClassRoom {
    private static int totalStudents;
    ArrayList<Student> students=new ArrayList<>();

    public void AddStudent(Student student)
    {
        this.students.add(student);
        ClassRoom.totalStudents++;
    }

    public void RemoveStudent(int rollNum){
        boolean isFound=false;
        for(Student student : students)
        {
            if(student.getRollNo()==rollNum) {
                isFound=true;
                students.remove(student);
                ClassRoom.totalStudents--;
            }
        }
        if(!isFound)
            System.out.println("No student is found with roll number " + rollNum);
    }

    public Student GetStudent(int rollNum)
    {
        boolean isFound=false;
        for(Student student : students)
        {
            if(student.getRollNo()==rollNum) {
                isFound=true;
                return student;
            }
        }
        if(!isFound)
            System.out.println("No student is found with roll number " + rollNum);

        return null;
    }

}
