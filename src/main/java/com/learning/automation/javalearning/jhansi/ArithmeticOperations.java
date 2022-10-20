package com.learning.automation.javalearning.jhansi;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arithmetic Operations using scanner
		
		int firstvalue = 0;
		int secondvalue = 0;
		int sum = 0;
		int substractionresult = 0;
		int division = 0;
		int multiplication = 0;
		
		System.out.println("--Arithmetic Operations--");
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the first value:");
		firstvalue=scanner.nextInt();
		
		System.out.println("Enter the second value:");
		secondvalue=scanner.nextInt();
		
		sum = firstvalue + secondvalue;
		System.out.println("Sum Result:" + sum);
		
		substractionresult = firstvalue - secondvalue;
		System.out.println("Substaction Result:" + substractionresult);
		
		division = firstvalue / secondvalue;
		System.out.println("Division Result:" + division);
		
		multiplication = firstvalue * secondvalue;
		System.out.println("Multiplication Result:" + multiplication);
	}

}