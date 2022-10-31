package com.learning.automation.javalearning.sravanthi;

public class UnderstandingExceptions {
	
	public static void main(String[] args) {
		
		//int a = 10;
		//int b = 0;
		//		int result = a/b;
		//System.out.println("Result is: " + result);
		int fValue = 20;
		int sValue =0 ;
		try {
		int result = fValue/sValue;
		System.out.println(result);
		}catch(ArithmeticException exception) {
			//exception.printStackTrace();
			System.out.println(" Dividing Number cannot be zero");
		}catch(Exception exception) {
			//exception.printStackTrace();
			System.out.println(" Error Occurred and progam exited ");
		}finally {
			System.out.println( " Finally block executed");
		}

	
	}

}
