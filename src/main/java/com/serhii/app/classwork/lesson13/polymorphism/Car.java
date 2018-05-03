package com.serhii.app.classwork.lesson13.polymorphism;

import com.serhii.app.classwork.lesson14.interfaces.Repairable;

public class Car implements Repairable {
    public String name;
    public int maxSpeed;

    public void drive() {
        System.out.println("Car drives");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void repairWheels() {

    }

    public void repairEngine() {

    }
}