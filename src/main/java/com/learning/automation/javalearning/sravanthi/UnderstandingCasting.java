package com.learning.automation.javalearning.sravanthi;

public class UnderstandingCasting {
	
	public static void main(String[] args) {
		
		//byte --> short --> char --> int --> long --> float --> double
		//double --> float --> long --> int --> char --> short --> byte
		
		//Casting int-long
		        int a = 10;
		        int b=60;
		        long sum = a+b;
		        System.out.println("Output of int-long is: " +sum);
		
		//Casting long-int
		        long a1 = 2222243;
		        int b1 = (int)a1;
		       System.out.println("Output of long-int is: "+b1);
		
		//Casting int-double
				int a2 = 20;
				double b2 = a2;
				System.out.println("Output of int-double is: "+b2);
				
		//Casting double-int
				double a3 =123.45 ;
				int b3 = (int)a3;
				System.out.println("Output of double-int is: "+b3);
			
		//Casting char-int
			    char a4 = 's' ;
			    int b4 = a4;
				System.out.println("Output of char-int  is: "+b4);
				
	   //Casting int-char
				int a5 = 67;
				char b5 = (char)a5;
				System.out.println("Output of int-char is: "+b5);
				
		//Casting byte-short
				byte a6 = 126;
				short b6 = a6;
				System.out.println("Output of byte-short is: "+b6);
				
		//Casting short-byte
				short a7 = 56;
				//short a7 = 128;
				byte b7 = (byte)a7;
				System.out.println("Output of short-byte is: "+b7);
				
		//Casting byte-int
				byte a8 = 12;
				//byte a8 =128;
				int b8 = a8;
				System.out.println("Output of byte-int is: "+b8);
				
		//Casting int-byte
				int a9 = 30;
				//int a9 = 128;
				byte b9 = (byte)a9;
				System.out.println("Output of long-int is: "+b9);
		
	}

}
