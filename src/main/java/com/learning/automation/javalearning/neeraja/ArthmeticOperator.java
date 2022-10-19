package com.learning.automation.javalearning.neeraja;

import java.util.Scanner;

public class ArthmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value:");
		int firstvalue=sc.nextInt();


		System.out.println("enter the second value:");
		int secondValue=sc.nextInt();
		
		
		int sum = firstvalue+ secondValue;
		System.out.println(" The sum of two values are "+sum);
		
		int sub=firstvalue-secondValue;
		System.out.println("The subtraction of two values are:"+sub);
		
		int mul=firstvalue*secondValue;
		System.out.println("The multiplication of two values are:"+mul);
		
		int div=firstvalue/secondValue;
		System.out.println("The division of two values are:"+div);
		
		System.out.println("The program is completed");
				
	}
	
}
