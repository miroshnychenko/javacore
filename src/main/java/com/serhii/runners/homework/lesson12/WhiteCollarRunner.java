package com.serhii.runners.homework.lesson12;

import com.serhii.app.homework.lesson12.WhiteCollar;

public class WhiteCollarRunner {
    public static void main(String[] args) {
        WhiteCollar collar = new WhiteCollar("Vasia", 33, "QWE inc");
        WhiteCollar collar2 = new WhiteCollar("Vasia", 33, "QWE;; inc");

        collar.setCompanyName("lll;l;;;");
        System.out.println(collar.getCompanyName());
    }
}
