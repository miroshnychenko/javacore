package com.serhii.app.homework.lesson6.practice;

import com.serhii.app.homework.lesson6.utils.Constants;

public class CircleArea {

    public static double calculate(String radiusStr) {
        double radius = Double.parseDouble(radiusStr);
        return Constants.PI * Math.pow(radius, 2);
    }

    public static String calculateBigger(String radius1, String radius2) {
        double area1 = calculate(radius1);
        double area2 = calculate(radius2);

        if (area1 > area2)
            return "Circle 1 area is bigger";
        else
            return "Circle 2 area is bigger";
    }
}
