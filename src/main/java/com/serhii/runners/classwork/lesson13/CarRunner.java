package com.serhii.runners.classwork.lesson13;

import com.serhii.app.classwork.lesson13.polymorphism.Audi;
import com.serhii.app.classwork.lesson13.polymorphism.BMV;
import com.serhii.app.classwork.lesson13.polymorphism.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new BMV();
        Car car2 = new Audi();

        car1.drive();
        car2.drive();

        System.out.println(car1);
        System.out.println(car2);
    }
}
