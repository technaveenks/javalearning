package com.learning.automation.javalearning.sonu;

public class AbstractionImplementation extends AMathematicalOperations implements IOperations {


    public static void main(String[] args) {
        AbstractionImplementation abstractionImplementation = new AbstractionImplementation();
        abstractionImplementation.addition(25,10);
        abstractionImplementation.multiplication(10,80);
        abstractionImplementation.Addition(12,5,9);

        UnderstandingMethods understandingMethods = new UnderstandingMethods();
        understandingMethods.addition(4,5);
    }
    @Override
    public void addition(int val1, int val2) {
        int result = val1 + val2;
        System.out.println(result);

    }

    @Override
    public void Addition(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);

    }
}
