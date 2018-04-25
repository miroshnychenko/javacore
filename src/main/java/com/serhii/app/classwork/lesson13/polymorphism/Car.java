package com.serhii.app.classwork.lesson13.polymorphism;

public class Car {
    String name;
    int maxSpeed;

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
}
