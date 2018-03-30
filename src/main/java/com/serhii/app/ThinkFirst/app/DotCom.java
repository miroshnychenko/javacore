package com.serhii.app.ThinkFirst.app;

import java.util.ArrayList;

public class DotCom {

    private ArrayList locationCells;

    public void setLocationCells(ArrayList locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Miss";
        int index = locationCells.indexOf(guess);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Drowned";
            } else {
                result = "Hit";
            }
        }
        System.out.println(result);
        return result;
    }
}


