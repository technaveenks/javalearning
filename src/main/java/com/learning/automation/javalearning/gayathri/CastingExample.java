package com.learning.automation.javalearning.gayathri;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	byte--short--char--int--long--float--double
	//	double--float--long--int--char--short--byte
		byte b=10;
		short sh=30;
		char c = 'a';
		int i=100;
		long l=400;
	    //float fl = 4.98f;
		double d=6.98;
		
		//int into long
		System.out.println("type casting");
		 long a = i;
		 System.out.println("casting of int to long" +a);
		//long into int
		int blong=(int)l;
		System.out.println("long int int" +blong);
		//int into double
		double cdouble = i;
		System.out.println("double into int" +cdouble);
		//char into int
		int chint = c;
		System.out.println("char into integer" +chint);
        // int into char
		char eintchar = (char)i;
		System.out.println("integer into char"  +eintchar);
		//byte to short
		short fshort = sh;
		System.out.println("byte into short"  +fshort);
		//short to byte
		short gbyte =(short)b;
		System.out.println("short into byte" +gbyte);
		//byte to int
		int fbyte = b;
		System.out.println("byte into int"  +fbyte);
		//int into byte
		byte hint = (byte)i;
		System.out.println("int into byte"  +hint);
	}

}
