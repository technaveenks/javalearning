package com.learning.automation.javalearning.gayathri;

public class AbstractionImplementation extends MathematicalOperations1 implements Ioperations{

	public static void main(String[] args) {
		AbstractionImplementation  AImp = new AbstractionImplementation();
		AImp.addition(10,30);
		AImp.multiplication(10,20);
		AImp.addition(10,20,30);
		
		//Accessing the methods from the same package
		
		MethodExample1 methods = new MethodExample1();
	    methods.addition();

	}
     
	@Override
	public void addition(int fvalue, int svalue) {
		// TODO Auto-generated method stub
		int result = fvalue+svalue;
		System.out.println("the result is " + result);
	}

	@Override
	public void addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("Method ");
	}			

}
