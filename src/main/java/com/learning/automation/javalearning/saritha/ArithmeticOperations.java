package com.learning.automation.javalearning.saritha;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value : ");
		int firstValue = scanner.nextInt();
		System.out.println(firstValue);
		System.out.println("Enter the second value : ");
		int secondValue = scanner.nextInt();
		System.out.println(secondValue);
		int sum = firstValue+secondValue;
		System.out.println("The sum of two values is: "+sum);
		int sub = firstValue-secondValue;
		System.out.println("The subtraction of two values is: "+sub);
		int mul = firstValue*secondValue;
		System.out.println("The multiplication of two values is: "+mul);
		int div = firstValue/secondValue;
		System.out.println("The division of two values is: "+div);
		int mod = firstValue%secondValue;
		System.out.println("The modulo of two values is: "+mod);
	
	}

}
