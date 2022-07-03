package com.madushan.observer;

public class Chart implements IObserver {

    private int value;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void update(int value) {
       this.value = value ;
    }
}
