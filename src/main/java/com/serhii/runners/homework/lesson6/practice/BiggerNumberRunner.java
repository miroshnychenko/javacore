package com.serhii.runners.homework.lesson6.practice;

import com.serhii.app.homework.lesson6.practice.BiggerNumber;

import java.util.Scanner;

public class BiggerNumberRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BiggerNumber numbers = new BiggerNumber();

        System.out.println("Please enter first number:");
        numbers.setNumber1(scanner.next());
        System.out.println("Please enter second number:");
        numbers.setNumber2(scanner.next());

        System.out.println(numbers.whatNumberIsBigger(numbers.getNumber1(), numbers.getNumber2()));
    }
}
