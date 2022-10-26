package com.learning.automation.javalearning.neeraja;

public class UnderstandingStatic {
	static int number =10;
	
	public static void addition() {
		int num1=10;
		int num2=20;
	int sum=num1+num2;
	System.out.println("sum of two numbers  are:"+sum);
	System.out.println("static variable is:"+number);
	number=number+5;
	}

	 static {
		 System.out.println("This is static block");
		 number=number+5;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We can  call static method by method name directly
		addition();
		//Calling static varaiable under main method
		System.out.println("static variable is:"+number);
	}

}
