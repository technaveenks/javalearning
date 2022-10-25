package com.learning.automation.javalearning.malathi;

import java.util.Scanner;

public class IfAndSwitch {
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to check it even/odd:");
		num=scanner.nextInt();
		if(num%2==0)
			System.out.println("Given number is an even number");
		else
			System.out.println("Given number is an odd number");
		
		if(num>0)
			System.out.println("Given number is a positive number");
		else if(num==0)
			System.out.println("Given number is a Zero");
		else 
			System.out.println("Given number is a negetive number");
		
		//ternary operator
		String result=num%2==0?"Given number is an even number":"Given number is an odd number";
		System.out.println(result);
		
		
		
		System.out.println("Enter a number to check the day");
		num=scanner.nextInt();
		switch (num) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Number is not in range.Please pick between 1to7 nexttime");
			break;
		}
	}


}
