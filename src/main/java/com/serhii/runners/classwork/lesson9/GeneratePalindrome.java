package com.serhii.runners.classwork.lesson9;

public class GeneratePalindrome {

    private static String generateString() {
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int random = (int) (Math.random() * alphabet.length());
            char character = alphabet.charAt(random);
            randomString.append(character);
        }
        return randomString.toString();
    }

    private static boolean isPalindrome(String palindrome) {
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome && (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
        }
        return isPalindrome;
    }

    private static int countOfAttempts() {
        boolean flag = true;
        int count = 0;
        while (flag) {
            count++;
            String random = generateString();
            if (isPalindrome(random)) {
                flag = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        boolean flag = true;
        int count = 0;

        // Just generate palindrome and shows count of attempts for successful generation
        while (flag) {
            count++;
            String random = generateString();
            if (isPalindrome(random)) {
                System.out.println("Palindrome generated from " + count + " attempt" + "\n"
                        + "Your palindrome is: " + random);
                flag = false;
            }
        }

        // Counts average of attempts for predefined number of runs
        int attempts = 100000;
        int attemptCount = 0;
        for (int i = 0; i < attempts; i++) {
            attemptCount += countOfAttempts();
        }

        System.out.println("Average attempts to generate palindrome (for " + attempts + " runs) is: "
                + attemptCount / attempts);
    }
}
