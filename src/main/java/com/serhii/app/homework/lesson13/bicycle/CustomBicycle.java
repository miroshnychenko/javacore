package com.serhii.app.homework.lesson13.bicycle;

public class CustomBicycle extends Bicycle {

    @Override
    public void setSpeed(int speed) {
        super.speed = speed;
        System.out.println("Speed is: " + super.speed);
    }

    @Override
    public void setGear(int gear) {
        super.gear = gear;
        System.out.println("New gear is set. Gear is: " + super.gear);
    }

    @Override
    public void ride() {
        System.out.println("Wshhhh!");
    }
}
