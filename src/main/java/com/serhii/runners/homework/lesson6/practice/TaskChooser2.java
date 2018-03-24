package com.serhii.runners.homework.lesson6.practice;

import java.util.Scanner;

public class TaskChooser2 {
    public static void main(String[] args) {

        System.out.println("To start right-angled triangle program enter 1");
        System.out.println("To calculate circle area enter 2");
        System.out.println("To play what number is bigger enter 3");
        System.out.println("Type 'exit' to exit");

        Scanner scanner = new Scanner(System.in);
        String usersChoice = scanner.next();

        switch (usersChoice) {
            case "1":
                RightAngledTriangleRunner.main(null);
                System.out.println(" ");
                main(null);
                break;
            case "2":
                CircleAreaRunner.main(null);
                System.out.println(" ");
                main(null);
                break;
            case "3":
                BiggerNumberRunner.main(null);
                System.out.println(" ");
                main(null);
                break;
            case "exit":
                System.out.println(" ");
                System.exit(1);
            default:
                System.out.println("Input is not correct");
                System.out.println(" ");
                main(null);
                break;
        }
    }
}
