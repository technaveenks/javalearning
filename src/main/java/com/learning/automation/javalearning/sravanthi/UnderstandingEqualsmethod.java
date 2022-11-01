package com.learning.automation.javalearning.sravanthi;


public class UnderstandingEqualsmethod {
	public static void main(String[] args) {
		//String str1 = "Java";
		//String str2 = "java";
		String s = "Learning";
		String s1 = "learning";
		
		System.out.println("Output of two strings comparision is: " +s.equals(s1));
		
		if(s == s1)
		{
			System.out.println("Two strings" + s + "and" + s1 + " are equal");
		}
		else
		{
			System.out.println("Two strings " + s  + " and  " + s1 + " are not equal");
		}
		
	}

}
