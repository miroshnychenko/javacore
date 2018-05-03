package com.serhii.runners.homework.lesson9;

import com.serhii.app.homework.Lesson9.Palindrome;
import com.serhii.app.homework.Lesson9.Helpers;
import com.serhii.app.classwork.lesson14.enums.Numbers;

import java.util.Scanner;

public class PalindromeRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Please select algorithm to check if your input is palindrome");
        System.out.println("1. To check with StringBuilder method \"reverse\"");
        System.out.println("2. To check with String reverse");
        System.out.println("3. To check with converting String to char array and reverse it");
        System.out.println("Type one, two or three");
        System.out.println("Type four to exit program");
        String userChoice = scanner.next();


        try {
            Numbers numbers = Numbers.valueOf(userChoice.toUpperCase());
            switch (numbers) {
                case ONE:
                    input = Helpers.stringInput();
                    System.out.println(Helpers.isPalindromeToString(Palindrome.isPalindrome1(input)));
                    System.out.println(" ");
                    main(null);
                    break;
                case TWO:
                    input = Helpers.stringInput();
                    System.out.println(Helpers.isPalindromeToString(Palindrome.isPalindrome2(input)));
                    System.out.println(" ");
                    main(null);
                    break;
                case THREE:
                    input = Helpers.stringInput();
                    System.out.println(Helpers.isPalindromeToString(Palindrome.isPalindrome3(input)));
                    System.out.println(" ");
                    main(null);
                    break;
                case FOUR:
                    System.out.println("Good bye");
                    System.exit(0);
                default:
                    System.out.println("Input is not correct");
                    System.out.println(" ");
                    main(null);
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Input is not correct");
            System.out.println(" ");
        }
    }
}
