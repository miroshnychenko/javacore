package com.serhii.app.classwork.lesson14.interfaces;

import com.serhii.app.classwork.lesson13.polymorphism.Car;

public class Lada extends Car implements Repairable {

    public Lada() {
        name = "Lada";
        maxSpeed = 120;
    }
    @Override
    public void repairWheels() {
        System.out.println("Lada wheels repaired.");
    }

    @Override
    public void repairEngine() {
        System.out.println("Lada engine repaired.");
    }
}
