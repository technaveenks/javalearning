package com.learning.automation.javalearning.malathi;

import java.util.Scanner;

public class UnderstandingMethods {
	
	int firstnumber;
	int secondnumber;
	
	public void addition() {
		int sum= firstnumber+secondnumber;
		System.out.println("sum of two given numbers: "+ sum);
	}
	public void subtraction() {
		int difference=firstnumber-secondnumber;
		System.out.println("Difference between two given numbers: "+ difference);
	}
	public void multiplication() {
		int product=firstnumber*secondnumber;
		System.out.println("Product of two given numbers: "+product);
	}
	public void division() {
		int division=firstnumber/secondnumber;
		System.out.println("Division of two given numbers:" +division );
	}
	public void modulo() {
		int remainder=firstnumber%secondnumber;
		System.out.println("The remainder of  "+ firstnumber+"/"+secondnumber +" is "+ remainder );
	}
	public static void main(String[] args) {
		UnderstandingMethods undersatndingMethos=new UnderstandingMethods();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		undersatndingMethos.firstnumber=scanner.nextInt();
		System.out.println("Enter the second number: ");
		undersatndingMethos.secondnumber=scanner.nextInt();
		
		
		undersatndingMethos.addition();
		undersatndingMethos.subtraction();
		undersatndingMethos.multiplication();
		undersatndingMethos.division();
		undersatndingMethos.modulo();
		
		
		
		
	}

}
