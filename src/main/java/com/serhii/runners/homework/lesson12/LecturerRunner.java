package com.serhii.runners.homework.lesson12;

import com.serhii.app.classwork.lesson12.Person;
import com.serhii.app.classwork.lesson12.Student;
import com.serhii.app.homework.lesson12.Lecturer;

public class LecturerRunner {

    public static void main(String[] args) {
        Person lecturer = new Lecturer("CS", 20,"professor");
        lecturer.printInfo();
        System.out.println();
        lecturer.showDegree();
        Student student = new Student("Vasia", "KPI", "Bachelor");
        student.showDegree();
    }
}
