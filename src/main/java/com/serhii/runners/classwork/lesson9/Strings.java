package com.serhii.runners.classwork.lesson9;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        String stringToDisplay = "";
        char[] charArrayToString = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < charArrayToString.length; i++) {
            stringToDisplay += charArrayToString[i];
        }
        System.out.println(stringToDisplay);

        stringToDisplay = Arrays.toString(charArrayToString).replace(",", "")
                .replace("[", "").replace("]", "").replace(" ", "")
                .trim();
        System.out.println(stringToDisplay);

        double dot = 12312.123123;
        String display = String.valueOf(dot);
        System.out.println(dot);
        System.out.println(display);

        String toFloat = "0.33";
        float fin = Float.valueOf(toFloat);
        System.out.println(toFloat);
        System.out.println(fin);

        Integer intValue = new Integer(1);
        Double doubleValue = new Double(2.2);
        Long longValue = new Long(2L);
        Boolean boolValue = new Boolean(true);

        //convert to string
        String intStr = String.valueOf(intValue);
        String doubleStr = String.valueOf(doubleValue);
        String longStr = String.valueOf(longValue);
        String boolStr = String.valueOf(boolValue);

        System.out.println(intStr);
        System.out.println(doubleStr);
        System.out.println(longStr);
        System.out.println(boolStr);

        //convert back
        int intVal = Integer.valueOf(intStr);
        double doubleVal = Double.valueOf(doubleStr);
        long longVal = Long.valueOf(longStr);
        boolean boolVal = Boolean.valueOf(boolStr);

        String a = "false";
        boolean b = Boolean.valueOf(a);

        System.out.println(a);
        System.out.println(b);

        //palindrome
        String palindrome = "moom";
        boolean isPalindrome = true;

        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome && (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
        }

        if (isPalindrome) {
            System.out.println("this is palindrome");
        } else {
            System.out.println("this is not palindrome");
        }
    }
}
