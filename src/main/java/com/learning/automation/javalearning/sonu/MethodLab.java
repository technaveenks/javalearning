package com.learning.automation.javalearning.sonu;

public class MethodLab {
    int num1 = 25;
    int num2 = 35;
    int sum;
    public void addition() {
        sum = num1 + num2;
        System.out.println("Sum of two numbers are: " + sum);
        System.out.println(sum);//other way
    }
    public void subtraction(){
        sum = num1 - num2;
        System.out.println("Subtraction of two numbers is: " + sum);
        System.out.println(sum);//other way
    }

    public void division(){
        sum = num1 / num2;
        System.out.println("Divison of two numbers is: " + sum);
        System.out.println(sum);
    }
    public void multiplication(){
        sum = num1 * num2;
        System.out.println("Multiplication of two numbers is:" + sum);
        System.out.println(sum);
    }
    public void modulo(){
        sum = num1 % num2;
        System.out.println("Modulo of two numbers is: " + sum);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        MethodLab methodLab = new MethodLab();
        methodLab.addition();
        methodLab.subtraction();
        methodLab.division();
        methodLab.multiplication();
        methodLab.modulo();
    }
}
