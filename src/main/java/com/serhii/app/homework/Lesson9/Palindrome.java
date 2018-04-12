package com.serhii.app.homework.Lesson9;

import java.util.Arrays;

public class Palindrome {

    public static boolean isPalindrome1(String str) {
        StringBuilder builder = new StringBuilder(str);
        return str.equals(builder.reverse().toString());
    }

    public static boolean isPalindrome2(String str) {
        String reversedStr = "";
        for (int i = 0; i < str.length(); i++) {
            reversedStr += str.charAt(str.length() - i - 1);
        }
        return str.equals(reversedStr);
    }

    public static boolean isPalindrome3(String str) {
        char[] strToChar = str.toCharArray();
        for (int i = 0; i < strToChar.length / 2; i++) {
            char temp = strToChar[i];
            strToChar[i] = strToChar[strToChar.length - i - 1];
            strToChar[strToChar.length - i - 1] = temp;
        }
        String result = Arrays.toString(strToChar).replace(", ", "");
        result = result.substring(1, result.length() - 1);
        return str.equals(result);
    }
}
