package com.learning.automation.javalearning;

public class UnderstandingLoops {

	public static void main(String[] args) {
		int fValue = 20, sValue = 25, tValue = 33;
		if (fValue > sValue) {
			System.out.println("First Value is greater");
		} else if (sValue > tValue) {
			System.out.println(" Second Value is greater");
		} else {
			System.out.println(" Third Value is greater ");
		}
		char colorCode = 'b';

		if (colorCode == 'v') {
			System.out.println("Color is Violet");
		} else if (colorCode == 'i') {
			System.out.println("Color is Indigo");
		} else if (colorCode == 'b') {
			System.out.println("Color is Blue");
		} else {
			System.out.println(" No Match Found ");
		}

		switch (colorCode) {
		case 'v':
			System.out.println("Color is Violet");
			break;
		case 'i':
			System.out.println("Color is Indigo");
			break;
		case 'b':
			System.out.println("Color is Blue");
			break;
		default:
			System.out.println(" No Match Found ");
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		int numbers[]= {2,4,6,3,7,9,1};
		System.out.println(" Indexed Number "+ numbers[3]);
		for(int z :numbers) {
			System.out.println("== " +z);
		}
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println("**** "+ numbers[i]);
		}
		int gasCost= 0;
		while(gasCost<=20) {
			System.out.println(" pumping gas and gas cost is "+gasCost);
			gasCost++;
		}
	//	gasCost=0;
		do {
			System.out.println(" *** pumping gas and gas cost is "+gasCost);
			gasCost++;
		}while(gasCost<=20);
		
		
	}

}
