package com.serhii.runners.homework.lesson6;
import java.util.Scanner;

public class TaskChooser {

    public static void main(String[] args) {

        System.out.println("To start right-angled triangle program enter 1");
        System.out.println("To calculate circle area enter 2");
        System.out.println("To play what number is bigger enter 3");

        Scanner scanner = new Scanner(System.in);
        int usersChoise = scanner.nextInt();

        if (usersChoise == 1) {
            RightAngledTriangleRunner.main(null);
        } else if (usersChoise == 2) {
            CircleAreaRunner.main(null);
        } else if (usersChoise == 3) {
            BiggerNumberRunner.main(null);
        } else {
            System.out.println("Input is not correct");
        }
    }
}
