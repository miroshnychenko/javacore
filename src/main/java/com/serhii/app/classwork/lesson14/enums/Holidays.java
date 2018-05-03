package com.serhii.app.classwork.lesson14.enums;

public enum Holidays {
    NEW_YEAR(1, "January", "New Year"), CHRISTMAS(7, "January", "Christmas"), LABOR_DAY(1, "May", "Labor day");

    int day;
    String month;
    String name;

    Holidays(int day, String month, String name) {
        this.day = day;
        this.month = month;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is on " + month + ", " + day;
    }
}
