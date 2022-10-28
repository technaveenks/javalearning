package com.learning.automation.javalearning.sujatha;

public class MathematicalOperation implements IArithmeticOperator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathematicalOperation MathematicalOperationobj=new MathematicalOperation();
		MathematicalOperationobj.Addition(6, 2);
		MathematicalOperationobj.Subtraction(10, 5);
		MathematicalOperationobj.Division(8, 4);
		MathematicalOperationobj.Modulo(6, 3);
	}

	@Override
	public void Addition(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void Subtraction(int a, int b) {
		// TODO Auto-generated method stub
		int c=a*b;
		System.out.println(c);
	}

	@Override
	public void Division(int a, int b) {
		// TODO Auto-generated method stub
		int c=a/b;
		System.out.println(c);
	}

	@Override
	public void Modulo(int a, int b) {
		// TODO Auto-generated method stub
		int c=a%b;
		System.out.println(c);
	}

}
