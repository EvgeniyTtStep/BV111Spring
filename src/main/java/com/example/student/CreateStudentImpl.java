package com.example.student;

public class CreateStudentImpl implements CreateStudent {

    Student student;

    @Override
    public void createStudent() {
        System.out.println(student.study());
    }
}
