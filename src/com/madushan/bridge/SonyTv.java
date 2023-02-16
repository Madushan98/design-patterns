package com.madushan.bridge;

public class SonyTv implements Device{

    @Override
    public void turnOn() {
        System.out.println("Sony: Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turn Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: setChannel");
    }
}
