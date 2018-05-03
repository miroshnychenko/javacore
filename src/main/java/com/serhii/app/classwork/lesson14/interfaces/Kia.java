package com.serhii.app.classwork.lesson14.interfaces;

import com.serhii.app.classwork.lesson13.polymorphism.Car;

public class Kia extends Car implements Repairable{

    public Kia() {
        name = "Kia";
        maxSpeed = 160;
    }

    @Override
    public void repairWheels() {
        System.out.println("Kia wheels repaired.");
    }

    @Override
    public void repairEngine() {
        System.out.println("Kia engine repaired.");
    }
}
