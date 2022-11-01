package com.learning.automation.javalearning.malathi;

public class UnderstandingExceptions {
	public static void main(String[] args) {
		int fValue=10;
		int sValue=2;
		try
		{
		int result=fValue/sValue;
		System.out.println(result);
	}
		catch(ArithmeticException exception){
			//exception.printStackTrace();
			System.out.println
			("Dividing by zero is not possible");
		}
		catch(Exception exception) {
			System.out.println
			("Error occured and program exited");
			
		}
		finally {
			System.out.println("Finally block executed");
		}
		}

}
