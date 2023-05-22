package com.madushan.interpreter;

public class AgeCheckExpression implements Expression{

    private final int minAge;

    public AgeCheckExpression(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public boolean interpret(String context) {
        return minAge <= Integer.parseInt(context.replaceAll("[^0-9]", ""));
    }
}
