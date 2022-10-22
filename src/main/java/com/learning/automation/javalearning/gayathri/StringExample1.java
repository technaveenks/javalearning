package com.learning.automation.javalearning.gayathri;

public class StringExample1 {
	public static void main(String[] args) {
		String firstvalue = "QA Training";
		String Secondvalue = "Automation"; 
		String space= " ";
		System.out.println(firstvalue.concat(Secondvalue));
		System.out.println((firstvalue.concat(space).concat(Secondvalue))); 
		System.out.println(firstvalue.concat(space).concat(Secondvalue).length());
		System.out.println(firstvalue.concat(space).concat(Secondvalue).toUpperCase());
		System.out.println(firstvalue.concat(space).concat(Secondvalue).toLowerCase());
		System.out.println(firstvalue.concat(space).concat(Secondvalue).substring(0,4));
		
		StringBuilder sBuilder = new StringBuilder("Java");
		System.out.println(sBuilder);
		sBuilder.append("GayatriJava");
		System.out.println(sBuilder);
		System.out.println(sBuilder.capacity());
		sBuilder.trimToSize();
		System.out.println(sBuilder.capacity());
		
		
	}
	
	
	
	
	


}