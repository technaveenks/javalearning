package com.learning.automation.javalearning;

import java.util.Scanner;

public class ArithmeticOperation {
	
	public static void main(String[] args) {
		
		/*
		 * System.out.println(" Arithmetic Operation ");
		 *  int firstValue = 10; 
		 *  int secondValue = 20; int sum= firstValue+secondValue; System.out.println(sum);
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter the first Value :");
		int firstValue = scanner.nextInt();
		System.out.println(firstValue);
		System.out.println(" Enter the Second Value :");
		int secondValue = scanner.nextInt();
		
		int sum = firstValue+ secondValue;
		System.out.println(" The sum of two values are "+sum);
		
		
	}

}
