package com.learning.automation.javalearning.sujatha;

public class AbstractionImplementation extends MathematicalOperationsAbstract implements IOperations{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionImplementation AImpobj=new AbstractionImplementation();
		AImpobj.multiplication(2, 3);
		AImpobj.addition(5, 6);
		AImpobj.Addition(0, 0, 0);
	}

	@Override
	public void addition(int fvalue, int svalue) {
		// TODO Auto-generated method stub
		int result=fvalue+svalue;
		System.out.println("Addition Result :"+result);
	}

	@Override
	public void Addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("Method from Interface");
	}

}
