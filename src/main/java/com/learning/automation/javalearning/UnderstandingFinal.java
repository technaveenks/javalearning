package com.learning.automation.javalearning;

final class UnderstandingFinal {
	
	final int age = 25;
	
	public final int addition() {
		int  sum = 20;
		return sum;
	}
	
	
	public static void main(String[] args) {
		UnderstandingFinal uFinal = new UnderstandingFinal();	
		//uFinal.age = 40;
		System.out.println(uFinal.age);
	}

}


