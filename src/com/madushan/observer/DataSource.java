package com.madushan.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements IObservable {
    private int value;
    private final List<IObserver> observerList = new ArrayList<>();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void add(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
       observerList.remove(observer);
    }

    @Override
    public void notifyObservable() {
        for (var element: observerList) {
            element.update(this.value);
        }
    }

}
