package com.learning.automation.javalearning.sravanthi.inheritance;

public class ClassB  extends ClassA{
	
	public void methodB() {
		System.out.println("This is from method B in Class B");
		
		int x=5,y=10,mul;
		mul = x * y;
		System.out.println("Multiplication of two nos: " + mul);
		
	}
	
	public static void main(String[] args) {
		ClassB cb = new ClassB();
		cb.methodB();
		cb.methodA();
		cb.methodZ();
	}

}
