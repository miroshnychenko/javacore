package com.serhii.app.homework.lesson13.bicycle;

public abstract class Bicycle {
    int speed;
    int gear;

    public abstract void setSpeed(int speed);

    public abstract void setGear(int gear);

    public void ride() {
        System.out.println("Wroom!");
    }
}
