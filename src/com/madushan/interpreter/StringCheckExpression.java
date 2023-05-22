package com.madushan.interpreter;

public class StringCheckExpression implements Expression{

    private final String data;

    public StringCheckExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        return context.contains(data);
    }
}
