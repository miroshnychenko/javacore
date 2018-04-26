package com.serhii.runners.homework.lesson13;

import com.serhii.app.homework.lesson13.computer.CPU;
import com.serhii.app.homework.lesson13.computer.Computer;
import com.serhii.app.homework.lesson13.computer.Dell;

public class ComputerRunner {
    public static void main(String[] args) {
        CPU intel = new CPU("Intel", 2);
        CPU amd = new CPU("AMD", 3);

        Computer comp1 = new Dell(intel, 16);
        Computer comp2 = new Dell(amd, 32);

        Computer[] computers = {comp1, comp2};
        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println("-----------------");
        changesForComputersArray(computers, amd);
        System.out.println(comp1);
        System.out.println(comp2);
    }

    private static void changesForComputersArray(Computer[] computers, CPU cpu) {
        for (Computer comp : computers) {
            comp.changeCpu(cpu);
        }
    }
}
