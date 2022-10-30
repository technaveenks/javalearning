package com.learning.automation.javalearning.sravanthi.inheritance;

public class ClassA  extends ClassZ{
	//public static void main(String[] args) {
		
	
	public void methodA() {
		System.out.println("This is methodA from Class A");
		int a=4,b=6,sum;
		sum  = a + b;
		System.out.println("Sum of two values form class A is : " +sum);
		
	}
	public static void main(String[] args) {
		
		ClassA method = new ClassA();
		method.methodA();
		//method.methodZ();
		
	}

}
//}
