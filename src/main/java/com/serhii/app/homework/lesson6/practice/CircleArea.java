package com.serhii.app.homework.lesson6.practice;

import com.serhii.app.homework.lesson6.utils.Constants;

import java.util.Scanner;

public class CircleArea {

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter radius of circle");
        double radius = scanner.nextDouble();

        double circleArea = Constants.PI * Math.pow(radius, 2);

        System.out.println("Area is " + circleArea);
    }

    private static double calculate(double radius) {
        return Constants.PI * Math.pow(radius, 2);
    }

    public static void calculateBigger() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter radius of circle1");
        double radius1 = scanner.nextDouble();

        System.out.println("Please enter radius of circle2");
        double radius2 = scanner.nextDouble();

        double area1 = calculate(radius1);
        double area2 = calculate(radius2);

        if (area1 > area2)
            System.out.print("Area1 is bigger");
        else
            System.out.print("Area2 is bigger");
    }
}
