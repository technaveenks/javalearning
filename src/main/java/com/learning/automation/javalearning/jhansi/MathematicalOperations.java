package com.learning.automation.javalearning.jhansi;

public class MathematicalOperations implements IArthimeticOperators{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathematicalOperations mathematicaloperations=new MathematicalOperations();
		mathematicaloperations.addition(10, 20);
		mathematicaloperations.substraction(5, 3);
		mathematicaloperations.multiplication(4, 2);
		mathematicaloperations.division(6, 1);
		mathematicaloperations.modulo(8, 9);
	}

	@Override
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}

	@Override
	public void substraction(int a, int b) {
		int c = a-b;
		System.out.println(c);
		
	}

	@Override
	public void multiplication(int a, int b) {
		int c = a*b;
		System.out.println(c);
		
	}

	@Override
	public void division(int a, int b) {
		int c = a/b;
		System.out.println(c);
		
	}

	@Override
	public void modulo(int a, int b) {
		int c = a%b;
		System.out.println(c);
		
		
	}

}
