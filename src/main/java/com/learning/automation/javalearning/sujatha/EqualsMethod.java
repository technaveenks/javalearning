package com.learning.automation.javalearning.sujatha;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Java";
		String s1="java";
		String a="Selenium";
		String a1="selenium";
		System.out.println("From .equals() method :"+s1.equals(s));
		if(a==a1)//Checking the condn right & left side
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equal");
		}
	}

}
