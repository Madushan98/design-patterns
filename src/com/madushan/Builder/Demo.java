package com.madushan.Builder;

public class Demo {

    public static void main(String[] args) {
        var car = new Car.CarBuilder(1, "Audi")
                .setEngine("V8")
                .setColor("Red")
                .build();

        System.out.println(car.getColor());
    }
}
