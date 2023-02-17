package com.madushan.statePattern;

public class Brush implements Tool {

    @Override
    public void mouseDrag() {
        System.out.println("Brush Drag");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brush mouseUp");
    }
}
