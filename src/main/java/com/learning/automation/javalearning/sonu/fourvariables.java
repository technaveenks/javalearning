package com.learning.automation.javalearning.sonu;

import java.util.Scanner;

public class fourvariables {
    public static void main(String[] args){

            Scanner obj = new Scanner(System.in);
       // System.out.print("Enter four numbers below : ");

        System.out.println("Enter first number: ");

            int a = obj.nextInt();
        System.out.println("Enter second number: ");
            int b= obj.nextInt();
        System.out.println("Enter third number: ");
            int c = obj.nextInt();
        System.out.println("Enter third number: ");
            int d = obj.nextInt();
        System.out.println("Results are: ");
            int sum = a+b+c+d;
            int diff = a-b-c-d;
            int mul =a*b*c*d;
            int mod =a%b%c%d;
            int div =(a+b)/(c+d);


        System.out.println("Addition is: "+sum);
        System.out.println("Subtraction is: "+diff);
        System.out.println("Multiplication is: "+mul);
        System.out.println("modulo is: "+mod);
        System.out.println("Division is: "+div);

        }
    }

