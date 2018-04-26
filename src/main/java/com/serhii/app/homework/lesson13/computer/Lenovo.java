package com.serhii.app.homework.lesson13.computer;

public class Lenovo extends Computer {

    public Lenovo(CPU cpu, int ram) {
        super(cpu, ram);
    }

    public void changeCpu(CPU cpu) {
        super.cpu = cpu;
    }
}
