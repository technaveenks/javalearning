package com.learning.automation.javalearning.sravanthi;

import java.security.DomainCombiner;

public class MathematicalOperations implements IArithmeticoperator {

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		int c =  a+b;
		System.out.println(c);
		
	}

	@Override
	public void subtraction(int a, int b) {
		// TODO Auto-generated method stub
		int c =  a-b;
		System.out.println(c);
		
		
		
	}

	@Override
	public void mutiplication(int a, int b) {
		// TODO Auto-generated method stub
		int c =  a*b;
	System.out.println(c);
		
		
	}

	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		int c =  a/b;
		System.out.println(c);
		
	}

	@Override
	public void modulo(int a, int b) {
		// TODO Auto-generated method stub
		int c =  a%b;
		System.out.println(c);
		
		
	}
public static void main(String[] args) {
	
	MathematicalOperations mathematicalOperations = new MathematicalOperations();
	mathematicalOperations.addition(10,5);
	mathematicalOperations.subtraction(5,2);
	mathematicalOperations.mutiplication(5,4);
	mathematicalOperations.division(8,2);
	mathematicalOperations.modulo(20, 3);
	
}

}

