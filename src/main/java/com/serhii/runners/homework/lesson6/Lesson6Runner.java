package com.serhii.runners.homework.lesson6;

import com.serhii.app.classwork.lesson6.Lesson6;

public class Lesson6Runner {

    public static void main(String[] args) {

        Lesson6 lesson1 = new Lesson6();
        Lesson6 lesson2 = new Lesson6();

        lesson1.name = "Name1";
        lesson2.name = "Name2";
        lesson1.setPhone(1234567);

        System.out.println(lesson1.name);
        System.out.println(lesson2.name);
        System.out.println("Lesson1 age " + Lesson6.age);
        System.out.println("Lesson2 age " + Lesson6.age);
        System.out.println("Lesson1 phone: " + lesson1.getPhone());
        System.out.println("Lesson2 phone: " + lesson2.getPhone());

        Lesson6.age = 22;

        System.out.println("Lesson1 age " + Lesson6.age);
        System.out.println("Lesson2 age " + Lesson6.age);
    }
}
