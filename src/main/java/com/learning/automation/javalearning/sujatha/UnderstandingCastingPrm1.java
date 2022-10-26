package com.learning.automation.javalearning.sujatha;

import java.util.Scanner;

public class UnderstandingCastingPrm1 {

	public static void main(String[] args) {

		byte b =10;
		short s=20;
		char c;
		int i=100;
		long l=200;
		float fl=5.12f;
		double d=300.34;
		System.out.println("Type Casting"); 
		System.out.println("*************");
		//Float to Integer
		int ifloat=(int) fl;
		System.out.println("Float to Integer"+" "+ifloat);
				//Integer to Double		
			double dbint=i;
			System.out.println("Integer to Double"+" "+dbint);
		//Double to Integer
			int intdouble=(int) d;
			System.out.println("Double to Integer"+" "+intdouble);
		//Integer to Long
			long lg=i;
			System.out.println("Integer to Long"+" "+lg);
		//Long to Integer
			int ilong=(int) l;
			System.out.println("Long to Integer"+" "+ilong);
		//Integer to Char
			char chint=(char) i;
			System.out.println("Integer to Char"+" "+chint);
		//Char to Integer
			int intchar=chint;
			System.out.println("Char to Integer"+" "+intchar);
		//Integer to Byte
			byte intby=(byte) i;
			System.out.println("Integer to Byte"+" "+intby);
		//Byte to Integer
			int bytei=intby;
			System.out.println("Byte to Integer"+" "+bytei);
			//Byte to Short
			short sbyte=intby;
			System.out.println("Byte to Short"+" "+sbyte);
		//Short to Byte
			byte byshort=(byte) sbyte;
			System.out.println("Short to Byte"+" "+byshort);
		//Short to Int
			short sint=(short) i;
			System.out.println("Short to Integer"+" "+sint);
		//Integer to Float
				float fint=i;
				System.out.println("Integer to Float"+" "+fint);
			
		
		
	}

}
