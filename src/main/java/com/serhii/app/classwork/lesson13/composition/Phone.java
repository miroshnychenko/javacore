package com.serhii.app.classwork.lesson13.composition;

public class Phone {
    private NFC nfc;
    private Bluetooth bluetooth;
    private Battery battery;

    public Phone(NFC nfc, Bluetooth bluetooth, Battery battery) {
        this.nfc = nfc;
        this.bluetooth = bluetooth;
        this.battery = battery;
    }

    public NFC getNfc() {
        return nfc;
    }

    public Bluetooth getBluetooth() {
        return bluetooth;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
