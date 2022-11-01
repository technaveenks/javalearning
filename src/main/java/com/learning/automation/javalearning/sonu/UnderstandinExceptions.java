package com.learning.automation.javalearning.sonu;

public class UnderstandinExceptions {

    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println(result);

        }catch(ArithmeticException exception){
            exception.printStackTrace();
            System.out.println("Dividing number cannot be zero");

        }catch(Exception exception){
            System.out.println("Error Occurred and Program Exited");

        }finally {
            System.out.println("Finally block executed");
        }



    }
}