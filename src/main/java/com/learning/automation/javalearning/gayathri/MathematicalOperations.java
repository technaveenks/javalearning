package com.learning.automation.javalearning.gayathri;

public class MathematicalOperations implements IArthmeticOperators{

	public static void main(String[] args) {
		MathematicalOperations mo = new MathematicalOperations();
		mo.addition(10,5);
		mo.subtraction(10,5);
		mo.multiplication(10,5);
		mo.division(10,5);
		mo.modulo(10,5);
		
	}

	@Override
	public void addition(int a, int b) {
		int c=a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtraction(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println(c);
	}

	@Override
	public void multiplication(int a, int b) {
		// TODO Auto-generated method stu
		int c=a*b;
		System.out.println(c);
	}

	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		int c=a/b;
		System.out.println(c);
	}

	@Override
	public void modulo(int a, int b) {
		// TODO Auto-generated method stub
		int c=a%b;
		System.out.println(c);
		
		
	}
}
