package com.learning.automation.javalearning.sonu;

public class WhileLoop {

    public static void main(String[] args) {

        int gasCost = 0;
        while(gasCost <= 10){
            System.out.println("gas cost is: "+gasCost);
            gasCost++;
        }
        System.out.println();
        System.out.println("DO WHILE LOOP");
        int num = 0;
        do {
            System.out.println(num);
            num++;
        }
        while(num < 5);
        }
    }


