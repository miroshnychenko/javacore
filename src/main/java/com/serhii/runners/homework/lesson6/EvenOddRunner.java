package com.serhii.runners.homework.lesson6;

import com.serhii.app.homework.lesson6.practice.EvenOdd;

import java.util.Scanner;

public class EvenOddRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");

        int number = scanner.nextInt();

        System.out.println("Your number " + EvenOdd.isEvenOrOdd(number));
    }
}
