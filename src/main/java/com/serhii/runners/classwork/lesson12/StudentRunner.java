package com.serhii.runners.classwork.lesson12;

import com.serhii.app.classwork.lesson12.Student;

public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student("Sew", "dd");
        System.out.println(student.getResponse());

        student.setResponse("123");
        System.out.println(student.getResponse());

        System.out.println(student.getName());
    }
}
