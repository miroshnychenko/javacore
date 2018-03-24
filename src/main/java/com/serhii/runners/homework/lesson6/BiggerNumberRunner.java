package com.serhii.runners.homework.lesson6;

import com.serhii.app.homework.lesson6.practice.BiggerNumber;

import java.util.Scanner;

public class BiggerNumberRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BiggerNumber numbers = new BiggerNumber();

        System.out.println("Please enter first number:");
        numbers.setNumber1(scanner.nextInt());
        System.out.println("Please enter second number:");
        numbers.setNumber2(scanner.nextInt());

        System.out.println(numbers.whatNumberIsBigger(numbers.getNumber1(), numbers.getNumber2()));
    }
}
