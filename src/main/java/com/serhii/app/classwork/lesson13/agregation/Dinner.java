package com.serhii.app.classwork.lesson13.agregation;

public class Dinner {
    private Meat meat;
    private Vegetables vegetables;
    private SideDish sideDish;

    public Dinner() {
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Vegetables getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetables vegetables) {
        this.vegetables = vegetables;
    }

    public SideDish getSideDish() {
        return sideDish;
    }

    public void setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
    }
}
