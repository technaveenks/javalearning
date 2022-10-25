package com.learning.automation.javalearning;

public class UnderstandingMethods {
	
	int firstValue = 10;
	int secondValue = 20;
	
	
	//access modifier return type methodname
	public void addition() {
		int summation = firstValue+secondValue;
		System.out.println(" The sum of two values are "+ summation);
	}
	
	public int addition(int firstValue, int secondValue) {
		int summation = firstValue+secondValue;
		//System.out.println(" The sum of two values are "+ summation);
		return summation;
	}
			
	public void substraction() {
		int subValue = firstValue - secondValue;
		System.out.println(" The substraction of two values are "+ subValue);
	}
	
	public void substraction(int firstValue, int secondValue) {
		int subValue = firstValue - secondValue;
		System.out.println(" The substraction of two values are "+ subValue);
	}
	
	public static void main(String[] args) {
		UnderstandingMethods  understandingMethods = new UnderstandingMethods();
		System.out.println(" The response from method with return type = " +understandingMethods.addition(12,44));
		understandingMethods.substraction();
		understandingMethods.substraction(44,13);
	}

}
