package com.learning.automation.javalearning.malathi;
import com.learning.automation.javalearning.malathi.*;
public class MathematicalOperations implements IArithmeticOperator{


	public static void main(String[] args) {
		MathematicalOperations mathematicalOperations=new MathematicalOperations();
		mathematicalOperations.addition(10,20);
		mathematicalOperations.subtraction(20,10);
		mathematicalOperations.multiplication(5,4);
		mathematicalOperations.division(40, 10);
		mathematicalOperations.modulo(7,2);
	}


	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
		
	}
   
	@Override
	public void subtraction(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println(c);
		
	}
	
	
	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		int c=a/b;
		System.out.println(c);
		
	}
    
	@Override
	public void multiplication(int a, int b) {
		// TODO Auto-generated method stub
		int c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void modulo(int a, int b) {
		// TODO Auto-generated method stub
		int c=a%b;
		System.out.println(c);
		
	}


	@Override
	public void additon(int fvalue, int svalue) {
		// TODO Auto-generated method stub
		
	}

}
