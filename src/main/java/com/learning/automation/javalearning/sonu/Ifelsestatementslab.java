package com.learning.automation.javalearning.sonu;

public class Ifelsestatementslab {
    public static void main(String[] args) {
        int a = 90;
        int b = 60;
        int c = 35;
        if (a < b) {
            System.out.println("a is less than b");
        }else if(b > a){
            System.out.println("b is greater than a");
        }else if(c < a) {
            System.out.println("c is less than a");
        }else{
            System.out.println("b is greater than a and c");
        }
    }
}
