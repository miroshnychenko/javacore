package com.serhii.app.classwork.lesson13.equals;

import java.util.Objects;

public class Student {
    String name;
    int age;
    int courseNumber;

    public Student(String name, int age, int courseNumber) {
        this.name = name;
        this.age = age;
        this.courseNumber = courseNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courseNumber=" + courseNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                courseNumber == student.courseNumber &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, courseNumber);
    }
}
