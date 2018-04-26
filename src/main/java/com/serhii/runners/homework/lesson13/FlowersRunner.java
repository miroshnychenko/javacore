package com.serhii.runners.homework.lesson13;

import com.serhii.app.homework.lesson13.flower.*;

public class FlowersRunner {
    public static void main(String[] args) {
        Flower rose = new Rose(50);
        Flower tulip = new Tulip(40);
        Flower gerbera = new Gerbera(45);
        Flower carnation = new Carnation(35);

        Flower[] flowers1 = {rose, rose, rose};
        Flower[] flowers2 = {tulip, rose, gerbera};
        Flower[] flowers3 = {carnation, carnation, carnation};
        Flower[] flowers4 = {gerbera, carnation, tulip};

        Bouquet bouquet1 = new Bouquet(flowers1);
        Bouquet bouquet2 = new Bouquet(flowers2);
        Bouquet bouquet3 = new Bouquet(flowers3);
        Bouquet bouquet4 = new Bouquet(flowers4);

        System.out.println(bouquet1.getPrice());
        System.out.println(bouquet2.getPrice());
        System.out.println(bouquet3.getPrice());
        System.out.println(bouquet4.getPrice());
    }
}
