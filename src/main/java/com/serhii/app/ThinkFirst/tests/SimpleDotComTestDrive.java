package com.serhii.app.ThinkFirst.tests;

import com.serhii.app.ThinkFirst.app.SimpleDotCom;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};

        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        String testResult = "Failure";

        if (result.equals("Hit")) {
            testResult = "Pass";
        }

        System.out.println(testResult);

        String userGuess2 = "3";

        String result1 = dot.checkYourself(userGuess2);

        if (result1.equals("Hit")) {
            testResult = "Pass";
        }

        System.out.println(testResult);

        String userGuess3 = "4";

        String result2 = dot.checkYourself(userGuess2);

        if (result2.equals("Hit")) {
            testResult = "Pass";
        }

        System.out.println(testResult);
    }
}
