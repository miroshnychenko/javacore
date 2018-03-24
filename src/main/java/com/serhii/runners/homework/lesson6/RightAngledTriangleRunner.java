package com.serhii.runners.homework.lesson6;

import com.serhii.app.homework.lesson6.practice.RightAngledTriangle;

import java.util.Scanner;

public class RightAngledTriangleRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RightAngledTriangle triangle = new RightAngledTriangle();
        System.out.println("Please enter side A length");
        triangle.setSideA(scanner.nextDouble());

        System.out.println("Please enter side B length");
        triangle.setSideB(scanner.nextDouble());

        System.out.println("Please enter side C length");
        triangle.setSideC(scanner.nextDouble());

        triangle.isRightAngledToConsole();
    }
}
