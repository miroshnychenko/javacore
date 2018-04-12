package com.serhii.app.homework.Lesson9;

import java.util.Scanner;

public class Helpers {

    public static String stringInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word:");
        return scanner.next();
    }

    public static String isPalindromeToString(boolean result) {
        return result ? "Your word is palindrome" : "Your word is not palindrome";

    }
}
