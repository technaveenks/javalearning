package com.learning.automation.javalearning.gayathri;

public class MethodExample1 {
	
	int a = 10;
	int b = 20;
	int sum = a + b;
    int diff = a-b;
	
	// creating a method	
	public void addition() {
		System.out.println("the addition of two numbers :" + sum);
	}
	// passing a parameter
	public int  addition(int a, int b) {
		int sum = a+b;
		//System.out.println("the addition of two numbers :" + sum);
		return sum;
	}
	public void subtraction() {
		
		System.out.println("the subtraction of two numbers :" + diff);
		
	}
	// passing a parameter
	public void subtraction(int a,int b) {
		int diff = a-b;
		System.out.println(("the subtraction of two numbers : " + diff));
	}
	public static void main(String[] args) {
		
		MethodExample1 me = new MethodExample1();
		me.addition();
		System.out.println("the response for the return type is: " + me.addition(20,40));
		me.subtraction();
		me.subtraction(40,20);
		
	}

}
