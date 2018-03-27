package com.serhii.app.ThinkFirst.tests;

import com.serhii.app.ThinkFirst.app.GameHelper;
import com.serhii.app.ThinkFirst.app.SimpleDotCom;

import java.util.Scanner;

public class SimpleDotComMain {
    public static void main(String[] args) {

        GameHelper helper = new GameHelper();
        int numOfGuess = 0;
        SimpleDotCom dot = new SimpleDotCom();

        int random = (int) (Math.random() * 4);

        int[] locations = {random, random + 1, random + 2};

        dot.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {

            System.out.println("Type your guess:");
            String guess = helper.getUserInput("Enter number:");
            String result = dot.checkYourself(guess);
            numOfGuess++;

            if (result.equals("Drowned")) {
                isAlive = false;
                System.out.println("You did it in " + numOfGuess + " attempts");
            }
        }
    }
}
