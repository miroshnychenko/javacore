package com.serhii.runners.classwork.lesson12;

import com.serhii.app.classwork.lesson12.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle("red");
        Bicycle bicycle3 = new Bicycle(23);
        Bicycle bicycle4 = new Bicycle(13, "blue");

        System.out.println("bicycle1 color is " + bicycle1.getColor());
        System.out.println("bicycle1 wheel size is " + bicycle1.getWheelSize());
        System.out.println(bicycle1.ride());

        bicycle1.setColor("yellow");
        bicycle1.setWheelSize(10);
        System.out.println("bicycle1 color (after using setter) is " + bicycle1.getColor());
        System.out.println("bicycle1 wheel size (after using setter) is " + bicycle1.getWheelSize());
        System.out.println(bicycle1.ride());

        System.out.println("bicycle2 color is " + bicycle2.getColor());
        System.out.println("bicycle2 wheel size is " + bicycle2.getWheelSize());
        System.out.println(bicycle2.ride());

        System.out.println("bicycle3 color is " + bicycle3.getColor());
        System.out.println("bicycle3 wheel size is " + bicycle3.getWheelSize());
        System.out.println(bicycle3.ride());

        System.out.println("bicycle4 color is " + bicycle4.getColor());
        System.out.println("bicycle4 wheel size is " + bicycle4.getWheelSize());
        System.out.println(bicycle4.ride());

        System.out.println(bicycle4.bicycleToString());
    }
}
