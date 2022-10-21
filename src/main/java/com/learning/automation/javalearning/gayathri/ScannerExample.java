package com.learning.automation.javalearning.gayathri;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first value"); 
		int a = sc.nextInt();
		System.out.println("enter the second value");
		int b = sc.nextInt();
		int result = a + b;
		System.out.println("Addition of a and b is :" +result);
		sc.close();	
	}

}