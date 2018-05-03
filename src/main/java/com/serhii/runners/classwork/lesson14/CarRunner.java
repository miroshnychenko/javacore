package com.serhii.runners.classwork.lesson14;

import com.serhii.app.classwork.lesson13.polymorphism.Car;
import com.serhii.app.classwork.lesson14.interfaces.Kia;
import com.serhii.app.classwork.lesson14.interfaces.Lada;

public class CarRunner {
    public static void main(String[] args) {
        Car kia = new Kia();
        Car lada = new Lada();

        kia.repairEngine();
        lada.repairEngine();
        kia.repairWheels();
        lada.repairWheels();
    }
}
