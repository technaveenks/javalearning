package com.learning.automation.javalearning.gayathri;

public class ExceptionsExample {
public static void main(String[] args) {
	int fvalue = 10;
	int svalue = 10;
	try {
	int result = fvalue/svalue;
	System.out.println(result);
	}catch(ArithmeticException exception) {
		System.out.println("Dividing number cannot be zero");
	}catch(Exception exception) {
		//	exception.printStackTrace();
		System.out.println("Error occured and program exited");
	}
finally{
		System.out.println("Finally block executed");
	}
}

}
