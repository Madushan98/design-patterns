package com.madushan.Builder;

public class Car {

    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    private final String color;
    private final String engine;
    private final String transmission;


    private Car(int id, String name, String color, String engine, String transmission) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
    }


    public static class CarBuilder {

        private final int id;
        private final String name;
        private String color;
        private String engine;
        private String transmission;

        public CarBuilder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Car build() {
            return new Car(id, name, color, engine, transmission);
        }

    }

}
