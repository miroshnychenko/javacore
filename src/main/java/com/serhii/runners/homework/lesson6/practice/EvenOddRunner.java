package com.serhii.runners.homework.lesson6.practice;

import com.serhii.app.homework.lesson6.practice.EvenOdd;

import java.util.Scanner;

public class EvenOddRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");

        String number = scanner.next();

        System.out.println("Your number " + EvenOdd.isEvenOrOdd(number));
    }
}
