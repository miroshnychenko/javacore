package com.serhii.app.homework.lesson13.computer;

public class Dell extends Computer{
    public Dell(CPU cpu, int ram) {
        super(cpu, ram);
    }

    public void changeCpu(CPU cpu) {
        super.cpu = cpu;
    }
}
