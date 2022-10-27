package com.learning.automation.javalearning.jhansi;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a single Java program of the casting.
		// byte -> short -> char -> int -> long -> float -> double
		// double -> float -> long -> int -> char -> short -> byte

		int i = 20;
		long l = 900000000;
		double d = 2.988E8;
		char c = 'a';
		byte b = 88;
		short s = 'b';
		
		//a. Int - long
		long sum =i + l;
		System.out.println(sum);
		
		//b. Long-int
		int sum1 = (int)(i + l);
		System.out.println(sum1);

		//c. Int-double
		double sum2 = i + d;
		System.out.println(sum2);
		
		//d. Double-int
		int sum3 = (int)(i + d);
		System.out.println(sum3);
		
		//e. Char-int
		int intvalue = (int)(c);
		System.out.println(intvalue);
		
		//f. Int-char
		char charvalue = (char)(i);
		System.out.println(charvalue);
		
		//g. byte-short
		short shortvalue = (short)(b);
		System.out.println(shortvalue);

		//h. Short- byte
		byte bytevalue = (byte)(s);
		System.out.println(bytevalue);
		
		//i. Byte-int
		int x = 123123123;
		int sum4 = x+b;
		System.out.println(sum4);
				
		//j. Int- byte
		byte y = 82;
		int  z = 20;
		byte bytevalue1 = (byte)(z);
		System.out.println(bytevalue1);
	}

}
