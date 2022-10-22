package com.learning.automation.javalearning;

public class UnderstandingMethods {
	
	int firstValue = 10;
	int secondValue = 20;
	
	
	//access modifier return type methodname
	public void addition() {
		int summation = firstValue+secondValue;
		System.out.println(" The sum of two values are "+ summation);
	}
			
	public void substraction() {
		int subValue = firstValue - secondValue;
		System.out.println(" The substraction of two values are "+ subValue);
	}
	
	public static void main(String[] args) {
		UnderstandingMethods  understandingMethods = new UnderstandingMethods();
		understandingMethods.addition();
		understandingMethods.substraction();
	}

}
