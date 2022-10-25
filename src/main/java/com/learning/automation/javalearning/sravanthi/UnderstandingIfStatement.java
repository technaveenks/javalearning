package com.learning.automation.javalearning.sravanthi;
import java.util.*;

public class UnderstandingIfStatement {
	
	public static void main(String[] args) {
		//Finding given number is even or odd using if-else
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int number = sc.nextInt();
		
		if (number%2==0) {
			System.out.println("Number " +number + " is Even Number");
		} else
			
			System.out.println("Number " +number + " is Odd Number " );
		
	}
	

	}
	

