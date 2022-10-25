package com.learning.automation.javalearning.sujatha;

public class UnderstandingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String FN="Akshay";
		String LN="Karthik";
		StringBuilder sbo=new StringBuilder("Welcome");
		String str="QA Automation";
		int x=20;
		String FullName=FN.concat(LN);
		System.out.println(FullName);
		System.out.println(FN.concat(LN).length());
		System.out.println(FN.concat(LN).toLowerCase());
		System.out.println(FN.concat(LN).substring(2, 7));
		System.out.println(FN.concat(LN).replace('a', 'i'));
		System.out.println(FN.concat(LN).equals(FN));
		System.out.println(FN.indexOf('s'));
		System.out.println(LN.contains(FN));
		System.out.println(LN.concat(FN));
		System.out.println(LN.codePointBefore(1));
		System.out.println(sbo.append(false));
		
		System.out.println("String Builder");
		System.out.println(sbo.lastIndexOf(LN));
		//StringBuilder Deletion**
		System.out.println(sbo.delete(3,5));
		
		System.out.println(sbo.lastIndexOf(str, 3));
		//String Reverse**
		//System.out.println(sbo.reverse());
		
		System.out.println(str.concat(" hello"));
		
		//Replace**
		System.out.println("replace");
		System.out.println(sbo.replace(2, 5,"HAI"));
		System.out.println(sbo.delete(3,6));
		
		//String conversion **
		System.out.println(String.valueOf(x));
		
		
		
		
	}

}
