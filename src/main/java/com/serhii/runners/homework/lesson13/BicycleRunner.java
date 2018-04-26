package com.serhii.runners.homework.lesson13;


import com.serhii.app.homework.lesson13.bicycle.Bicycle;
import com.serhii.app.homework.lesson13.bicycle.BicycleWithRing;
import com.serhii.app.homework.lesson13.bicycle.BicycleWithRingInterface;
import com.serhii.app.homework.lesson13.bicycle.CustomBicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        BicycleWithRingInterface bicycle1 = new BicycleWithRing();
        bicycle1.ring();
        Bicycle bicycle2 = new CustomBicycle();
        bicycle2.setGear(22);
        bicycle2.ride();
    }
}
