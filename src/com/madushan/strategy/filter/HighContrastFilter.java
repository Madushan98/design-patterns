package com.madushan.strategy.filter;

public class HighContrastFilter implements  FilterStrategy {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying High Contrast filter");
    }

}

