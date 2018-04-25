package com.serhii.app.classwork.lesson12;

public class Person {

    protected String name;
    protected String university;
    protected String response;
    protected String faculty;
    protected int experience;
    protected String degree;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void printInfo() {

    }

    public void showDegree(){
        System.out.println("General degree");
    }
}
