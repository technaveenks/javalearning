package com.learning.automation.javalearning.malathi;

public class UnderstandingCastingInJava {
	public static void main(String args[]) {
		int intnumber=10;
		long longnumber;;
		//1.1 Upcasting int number to long
		longnumber=intnumber;
		System.out.println("Long number is: "+longnumber);
		
		//1.2 Downcasting long to int
		longnumber=1242222222;
		intnumber=(int)longnumber;
		System.out.println("Integer number is:"+intnumber);
		
		//2.1 upcasting int to double
		double doublenumber=2356.46;
		doublenumber=intnumber;
		System.out.println("Double number is: "+doublenumber);
		
		//2.2 Downcasting double to int
		doublenumber=2356.46;
		intnumber=(int)doublenumber;
		System.out.println("Integer number is:"+intnumber);
		
		//3.1 upcasting chat to int
		char ch='M';
		intnumber=ch;
		System.out.println("Integer number is:"+intnumber);
		
		//3.2Downcasting int to char
		intnumber=77;
		ch=(char) intnumber;
		System.out.println("Character value is: "+ch);
		
		//4.1 Downcasting short to byte
		byte b=127;
		short s=12345;
		b=(byte)s;
		System.out.println("The byte value is: "+b);
		
		//4.2 Upcasting byte to short
		s=12345;
		s=b;
		System.out.println("The short value is:"+s);
		
		//5.1 Downcasting int to byte
		b=(byte)intnumber;
		System.out.println("The byte value is: "+b);
		
		//5.2 Upcasting byte to int
		intnumber =b;
		System.out.println("Integer number is:"+intnumber);	
		
	}


}
