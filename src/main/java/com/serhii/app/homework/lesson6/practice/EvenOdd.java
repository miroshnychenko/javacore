package com.serhii.app.homework.lesson6.practice;

public class EvenOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static String isEvenOrOdd(int number) {
        if (isEven(number)) {
            return "is Even";
        }
        return "is Odd";
    }
}
