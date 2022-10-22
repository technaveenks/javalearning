package com.learning.automation.javalearning.neeraja;

import java.util.Scanner;

public class ArthimeticOperator {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the first Value :");
		int firstValue = sc.nextInt();
		
		
		System.out.println(" Enter the Second Value :");
		int secondValue = sc.nextInt();
		
		int sum = firstValue+ secondValue;
		System.out.println(" The sum of two values are "+sum);
		

		int sub = firstValue- secondValue;
		System.out.println(" The subtraction of two values are "+sub);
		
		int mul = firstValue* secondValue;
		System.out.println(" The multiplication of two values are "+mul);
		
		int div = firstValue/ secondValue;
		System.out.println(" The division of two values are "+div);
	}

}
