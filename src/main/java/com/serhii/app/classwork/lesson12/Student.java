package com.serhii.app.classwork.lesson12;

public class Student extends Person{

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public Student(String name, String university, String degree) {
        super(name);
        this.university = university;
        this.degree = degree;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void showDegree(){
        System.out.println(degree);
    }
}