package com.serhii.app.homework.lesson13.computer;

public class CPU {
    private String brand;
    private int frequency;

    public CPU(String brand, int frequency) {
        this.brand = brand;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "brand='" + brand + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
