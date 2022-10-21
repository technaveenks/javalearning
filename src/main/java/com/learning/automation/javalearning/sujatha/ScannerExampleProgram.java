package com.learning.automation.javalearning.sujatha;

import java.util.Scanner;

public class ScannerExampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the First Number");
		Scanner s=new Scanner(System.in);
		int FN=s.nextInt();
		System.out.println("The First Number is :"+FN);
		System.out.println("Enter the Second Number");
		int SN=s.nextInt();
		
		System.out.println("The Second Number is :"+SN);
		int Result=FN+SN;
		System.out.println("The Addtion of Two Numbers "+FN +" & "+ SN +" is :"+Result);
		
	}

}
