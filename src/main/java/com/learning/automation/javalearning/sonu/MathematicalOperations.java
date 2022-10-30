package com.learning.automation.javalearning.sonu;

public class MathematicalOperations implements IArithmeticOperations{
    @Override
    public void addition(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    @Override
    public void subtraction(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    @Override
    public void division(int a, int b) {
       int c = a / b;
       System.out.println(c);
    }

    @Override
    public void multiplication(int a, int b) {
      int c = a * b;
      System.out.println(c);
    }

    public static void main(String[] args) {
        MathematicalOperations mathematicalOperations = new MathematicalOperations();
        mathematicalOperations.addition(50,10);
        mathematicalOperations.subtraction(50,10);
        mathematicalOperations.division(50,10);
        mathematicalOperations.multiplication(50,10);
    }
}
