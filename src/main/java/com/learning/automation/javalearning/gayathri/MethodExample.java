package com.learning.automation.javalearning.gayathri;

public class MethodExample {
	
	int a = 10;
	int b = 20;
	int sum = a+b;
	int mul = a*b;
	
	//Declaring a method
	
	public void addition() {
		System.out.println("print the sum of two numbers : " + sum);
	}
	
	public void subtraction() {
		int Diff = a-b;
		System.out.println("print the subtraction of two numbers : " + Diff);
	}
	public void multiplication() {
		System.out.println("print the multiplication of two numbers : " + mul);
		
	}
	public void division() {
		int Div = a/b;
		System.out.println("print the division of two numbers : " + Div);
	}
	public void modulo() {
		
		int mod = a%b;
		System.out.println("print the modulo of two numbers : " + mod);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MethodExample methodex = new MethodExample();
      methodex.addition();
      methodex.subtraction();
      methodex.multiplication();
      methodex.division();
      methodex.modulo();
	}

}
