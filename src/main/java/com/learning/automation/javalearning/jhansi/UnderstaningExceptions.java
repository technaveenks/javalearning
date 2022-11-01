package com.learning.automation.javalearning.jhansi;

public class UnderstaningExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fvalue = 10;
		int svalue = 0;
		try {
		int result = fvalue/svalue;
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
