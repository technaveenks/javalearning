package com.learning.automation.javalearning.neeraja;

public class UnderstandingCasting {
	// byte -> short -> char -> int -> long -> float -> double

		// double -> float -> long -> int -> char -> short -> byte
	
	
	public static void castingToDifferentTypes() {
		// int to long
		int x=10;
		int y=20;
		long z=x+y;
		System.out.println("casting from int to long:"+z);
		//long to int
		long a=3445555l;
		int b=(int)a;
		System.out.println("casting from long to int:"+b);
		//int to double
		int i=5;
		double d=i;
		//System.out.println(i);
		System.out.println("casting from  int to double:"+d);
		//double to int
		double d1=89676363.97d;
		int i1=(int)d1;
		System.out.println("casting from  double to int:"+i1);
		//char to int
		char c='n';
		//System.out.println(c);
		int i2=c;
		System.out.println("casting from char to int:"+i2);
		//int to char
		int i3=110;
		//System.out.println(i3);
		char c1=(char)i3;
		System.out.println("casting from int to char:"+c1);
		
		//byte to short
		byte b1=5;
		
		short s1=b1;
		System.out.println("casting from byte to short:"+b1);
		
		//short to byte
		
		short s2=45;
		byte b2=(byte)s2;
		System.out.println("casting from short to byte:"+b2);
		
		//byte to int
		byte b3=10;
		int i5=b3;
		System.out.println("casting from byte to int:"+b3);
		
		
		//int to byte
		int i6=100;
		
		byte b4=(byte)i6;
		System.out.println("casting from int to byte:"+i6);
		
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		castingToDifferentTypes() ;

	}

}
