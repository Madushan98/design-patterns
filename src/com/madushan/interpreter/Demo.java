package com.madushan.interpreter;

public class Demo {

    public static Expression checkMaleAgeExpression(){
        Expression expression1 = new StringCheckExpression("Male");
        Expression expression2 = new AgeCheckExpression(18);
        return new AndExpression(expression1,expression2);
    }

    public static void main(String[] args) {
        String str1 = "Jhon is Male and 10 years old";
        Expression expression = checkMaleAgeExpression();
        System.out.println("Is Jhon male and over 18 years? " + expression.interpret(str1));

    }
}
