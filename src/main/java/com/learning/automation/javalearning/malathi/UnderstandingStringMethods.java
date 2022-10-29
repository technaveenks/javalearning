package com.learning.automation.javalearning.malathi;

public class UnderstandingStringMethods {
	public static void main(String[] args) {
		String firststring = "First String";
		String compare="Second String";
		CharSequence cs="abc";
		char[] data = {'c','d','e'};
		StringBuffer sb=new StringBuffer("First String");
		System.out.println(firststring.charAt(2));
		System.out.println(firststring.codePointAt(0));
		System.out.println(firststring.codePointBefore(1));
		System.out.println(firststring.codePointCount(0,10));
		System.out.println(firststring.compareTo("Hello"));
		System.out.println(firststring.compareToIgnoreCase("first string"));
		;
				System.out.println(firststring.contains(cs));
				System.out.println(firststring.contentEquals(cs));
				System.out.println(firststring.contentEquals(sb));
				System.out.println(String.copyValueOf(data));
				System.out.println(String.copyValueOf(data,0,2));
				System.out.println(firststring);
				System.out.println(data);
				System.out.println(firststring.endsWith("."));
				System.out.println(firststring.equals(firststring));
				System.out.println(String.format("The secong string is %s", compare));
				char[] ch={'a','s','s','d'};
				System.out.println((String.copyValueOf(ch)).getClass().getSimpleName());
	}

}
