package com.learning.automation.javalearning;

public class UnderstandingConstructor {
	int firstValue,secondValue;
	
	public UnderstandingConstructor() {
		firstValue = 50;
		secondValue = 40;
	}
	
	public UnderstandingConstructor(int firstValue, int secondValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}
	
	public void substraction() {
		int subValue = firstValue - secondValue;
		System.out.println(" The substraction of two values are "+ subValue);
	}
	
	public static void main(String[] args) {
		UnderstandingConstructor constructors = new UnderstandingConstructor(20,44);
		constructors.substraction();
		//constructors = new UnderstandingConstructor();
		//constructors.substraction();
	}

}
