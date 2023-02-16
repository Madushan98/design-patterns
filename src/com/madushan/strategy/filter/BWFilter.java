package com.madushan.strategy.filter;

public class BWFilter implements FilterStrategy {


    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter");
    }
}

