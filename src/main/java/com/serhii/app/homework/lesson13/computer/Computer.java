package com.serhii.app.homework.lesson13.computer;

public class Computer {
    CPU cpu;
    int ram;

    public Computer(CPU cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public void changeCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "computer{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                '}';
    }
}
