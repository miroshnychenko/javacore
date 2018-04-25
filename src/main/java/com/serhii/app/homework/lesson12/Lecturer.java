package com.serhii.app.homework.lesson12;

import com.serhii.app.classwork.lesson12.Person;

public class Lecturer extends Person {

    public Lecturer(String faculty, int experience, String degree) {
        this.faculty = faculty;
        this.experience = experience;
        this.degree = degree;
    }
    @Override
    public void printInfo(){
        System.out.printf("Lecturer faculty: %s, experience: %d, degree: %s",faculty, experience, degree);
    }

    @Override
    public void showDegree(){
        System.out.println(degree);
    }
}
