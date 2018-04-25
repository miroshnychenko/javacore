package com.serhii.app.classwork.lesson13.equals;

import java.util.Objects;

public class Laptop {
    private int cpu;
    private int ram;
    private int size;

    public Laptop(int cpu, int ram, int size) {
        this.cpu = cpu;
        this.ram = ram;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return cpu == laptop.cpu &&
                ram == laptop.ram;
    }

    @Override
    public int hashCode() {

        return Objects.hash(cpu, ram);
    }
}
