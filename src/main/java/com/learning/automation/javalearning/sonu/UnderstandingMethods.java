package com.learning.automation.javalearning.sonu;

public class UnderstandingMethods {
      int num1 = 30;
      int num2 = 40;
      int sum;

    public void addition(){
        int sum = num1 + num2;
        System.out.println(sum);
    }
    public void addition(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        int sum = num1 + num2;

        System.out.println("The sum of the two numbers is: "+sum);

    }
    public void subtraction(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        sum = num1 - num2;
        System.out.println("Subtraction of num1 from num2 is: "+sum);

    }

    public void multiplication(int num1){
        this.num1 = num1;
      //  this.num2 = num2;
        sum = num1 * num2;
        System.out.println("the product of two numbers is: "+sum);
    }

    public static void main(String[] args) {
        UnderstandingMethods understandingMethods = new UnderstandingMethods();
        understandingMethods.addition();
        understandingMethods.addition(700,200);
        understandingMethods.subtraction(9,8);
        understandingMethods.multiplication(3);
    }
}
