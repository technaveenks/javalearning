package com.learning.automation.javalearning.jhansi;

public class Parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a single Java program to perform parsing in the below format:
		// byte -> short -> char -> int -> long -> float -> double
		// double -> float -> long -> int -> char -> short -> byte
		
		String r = "10";
		int i = 20;
		long l = 900000000;
		float f = 2.33f;
		double d = 2.988E8;
		char c = 'a';
		byte b = 88;
		short s = 'b';
		
		//a. string- int
		int intvalue = Integer.parseInt(r);
		System.out.println(intvalue);
		
		//b. int-string
		String stringvalue = String.valueOf(i);
		System.out.println(stringvalue);

		//c. string – long
		long longvalue = Long.parseLong(r);
		System.out.println(longvalue);
		
		//d. long- string
		String stringvalue1 = String.valueOf(l);
		System.out.println(stringvalue1);
		
		//e. string-float
		Float floatvalue = Float.parseFloat(r);
		System.out.println(floatvalue);
		
		//f. float-string
		String stringvalue2 = String.valueOf(f);
		System.out.println(stringvalue2);
		
		//g. string-double
		Double doublevalue = Double.valueOf(r);
		System.out.println(doublevalue);
		
		//h. double- string
		String stringvalue3 = String.valueOf(d);
		System.out.println(stringvalue3);
		
		//i. string-char
		Character charvalue = r.charAt(0);
		System.out.println(charvalue);
		
		//j. char-string
		String stringvalue4 = String.valueOf(c);
		System.out.println(stringvalue4);
		
		//k. string-object
		Object objectvalue = r;
		System.out.println(objectvalue);
		
		//l. object- string
		Object o = new Object();
		String stringvalue5 = String.valueOf(o);
		System.out.println(stringvalue5);
		
		//m. string- Boolean
		Boolean booleanvalue = Boolean.valueOf(r);
		System.out.println(booleanvalue);
		
		//To make boolean to True
		String t = "true";
		Boolean booleanvalue1 = Boolean.valueOf(t);
		System.out.println(booleanvalue1);
	}

}
