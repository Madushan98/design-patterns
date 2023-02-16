package com.madushan.decorator.Stream;

public class CloudStream implements Stream {

    @Override
    public void write(String data) {
        System.out.println("Storing " + data + " in cloud storage");
    }
}

