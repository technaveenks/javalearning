package com.learning.automation.javalearning.sravanthi;

import java.util.*;

public class UserInputString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name:");
		String YourName = sc.nextLine();
		System.out.print("Enter your country:");
		String Country = sc.nextLine();
		System.out.println("Your Name is:" +YourName  +  "and Your country name is: " +Country);
		
	}

}
