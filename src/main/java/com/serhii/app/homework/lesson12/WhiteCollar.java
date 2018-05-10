package com.serhii.app.homework.lesson12;

public class WhiteCollar extends Human {
    private String companyName;

    public WhiteCollar(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName.matches("^[a-zA-Z, -]+$")) {
            this.companyName = companyName;
        } else {
            System.out.println("Company name is invalid");
        }

    }
}
