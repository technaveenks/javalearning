package com.learning.automation.javalearning;

public class UnderstandingCasting {

	// byte -> short -> char -> int -> long -> float -> double

	// double -> float -> long -> int -> char -> short -> byte
	public static void main(String[] args) {
		int x = 10;
		float z = 13.4f;
		int sum =(int)(x + z);
		// float sum = x+z;
		System.out.println(sum);
		String number = String.valueOf(x);
		System.out.println(number.getClass());
		String value = "22.33";
		float values = Float.parseFloat(value);
		System.out.println(values);

	}
}
