package com.serhii.app.ThinkFirst.tests;

import com.serhii.app.ThinkFirst.app.DotCom;
import com.serhii.app.ThinkFirst.app.GameHelper;

import java.util.ArrayList;

public class DotComMain {

    public static void main(String[] args) {

        GameHelper helper = new GameHelper();
        int numOfGuess = 0;
        DotCom dot = new DotCom();

        int random = (int) (Math.random() * 4);

        ArrayList<Integer> locations = new ArrayList<>();
        locations.add(random);
        locations.add(random+1);
        locations.add(random+2);

        dot.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {

            String guess = helper.getUserInput("Type your guess:");
            String result = dot.checkYourself(guess);
            numOfGuess++;

            if (result.equals("Drowned")) {
                isAlive = false;
                System.out.println("You did it in " + numOfGuess + " attempts");
            }
        }
    }
}
