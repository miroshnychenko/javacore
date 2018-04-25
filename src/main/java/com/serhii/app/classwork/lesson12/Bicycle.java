package com.serhii.app.classwork.lesson12;

public class Bicycle {
    private int wheelSize;
    private String color;

    public Bicycle(int wheelSize, String color) {
        this(23);
        this.wheelSize = wheelSize;
        this.color = color;
    }

    public Bicycle(String color) {
        this();
        this.color = color;
    }

    public Bicycle(int wheelSize) {
        this();
        this.wheelSize = wheelSize;
    }

    public Bicycle() {
        this.color = "no color";
        this.wheelSize = 26;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getColor() {
        return color;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String ride() {
        return "Wroom!";
    }

    public String bicycleToString(){
        return "bicycle color is " + this.color + " bicycle wheel is "  + this.wheelSize;
    }
}
