package com.serhii.runners.homework.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkPart7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String totalString = "";
        System.out.println("Please enter a numbers one by one. \nType 'exit' to finish'");

        while (true) {
            System.out.println("Please enter a number:");
            userInput = scanner.next();
            if (userInput.equals("exit")) {
                break;
            }
            if (userInput.matches("\\d+")) {
                totalString = totalString + userInput + ",";
            } else {
                System.out.println("You should enter a number!");
            }
        }
        System.out.println(totalString);

        String[] newArr = totalString.split(",");
        int[] intArr = new int[newArr.length];

        if (totalString.isEmpty()) {
            System.out.println("You did not enter any number");
            System.exit(0);
        }
        for (int i = 0; i < intArr.length; i++) {

            intArr[i] = Integer.parseInt(newArr[i]);
        }
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(intArr));
        int sum = Arrays.stream(intArr).sum();
        System.out.println(sum);
    }

}
