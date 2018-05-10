package com.serhii.app.homework.lesson12;

public class WhiteCollar extends Human{
    private String companyName;

    public WhiteCollar(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
