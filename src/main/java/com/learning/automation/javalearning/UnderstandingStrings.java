package com.learning.automation.javalearning;

public class UnderstandingStrings {
	
	public static void main(String[] args) {
		
		String firstName = "Robert";
		String lastName = "McLaren";
		String space = " ";
		
		System.out.println(firstName.concat(space).concat(lastName));
		
		System.out.println(firstName.concat(space).concat(lastName).length());
		System.out.println(firstName.concat(space).concat(lastName).toUpperCase());
		System.out.println(firstName.concat(space).concat(lastName).substring(0,2));
		
		StringBuilder sBuilder = new StringBuilder("Sean");
		System.out.println(sBuilder);
		sBuilder.append("Tiffany");
		System.out.println(sBuilder.capacity());
		sBuilder.trimToSize();
		System.out.println(sBuilder.capacity());
		
	}

}

