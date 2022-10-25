package com.learning.automation.javalearning.sonu;

import java.util.Scanner;

public class SwitchLab {
    public static void main(String[] args) {
        System.out.println("1] Checking\n2] Savings\n3] Virtual Wallet\n4] Credit Cards ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers between 1-4: ");
        int banking = sc.nextInt();

        switch (banking){
            case 1:
                System.out.println("Banking type is Checking.");
                break;

            case 2:
                System.out.println("Banking type is Savings");
                break;

            case 3:
                System.out.println("Banking type is Virtual Wallet");
                break;

            case 4:
                System.out.println("Banking type is Credit Cards");
                break;

            default:
                System.out.println("Not a valid entry.");


        }
    }
}
