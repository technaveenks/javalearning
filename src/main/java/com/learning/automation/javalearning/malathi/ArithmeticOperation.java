package com.learning.automation.javalearning.malathi;

import java.util.Scanner;

public class ArithmeticOperation {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the first number");
		int firstnumber=scanner.nextInt();
		System.out.println("please enter the second number");
		
		int secondnumber=scanner.nextInt();
		int result=firstnumber +secondnumber ;
		System.out.println("Sum of the two numbers is: "+result); 
		result=firstnumber-secondnumber ;
		System.out.println("Difference between two numbers is: "+result);
		result=firstnumber/secondnumber;
		System.out.println("division of two numbers is: "+result);
		result=firstnumber*secondnumber;
		System.out.println("Product of two numbers is: "+result);
		result=firstnumber%secondnumber;
		System.out.println("Remainder of the numbers is: "+result);
		
		
		
	}

}
