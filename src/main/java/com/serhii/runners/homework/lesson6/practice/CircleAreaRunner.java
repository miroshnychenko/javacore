package com.serhii.runners.homework.lesson6.practice;

import com.serhii.app.homework.lesson6.practice.CircleArea;

import java.util.Scanner;

public class CircleAreaRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter radius of first circle");
        String radius1 = scanner.next();
        System.out.println("Circle 1 area is " + CircleArea.calculate(radius1));

        System.out.println("Please enter radius of second circle");
        String radius2 = scanner.next();
        System.out.println("Circle 2 area is " + CircleArea.calculate(radius2));
        System.out.println("----------------------");
        System.out.println(CircleArea.calculateBigger(radius1, radius2));
    }
}
