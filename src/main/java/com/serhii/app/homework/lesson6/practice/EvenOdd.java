package com.serhii.app.homework.lesson6.practice;

public class EvenOdd {

    public static boolean isEven(String number) {
        return Integer.parseInt(number) % 2 == 0;
    }

    public static boolean isOdd(String number) {
        return Integer.parseInt(number) % 2 != 0;
    }

    public static String isEvenOrOdd(String number) {
        if (isEven(number)) {
            return "is Even";
        }
        return "is Odd";
    }
}
