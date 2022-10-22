package com.learning.automation.javalearning.sravanthi;

public class StringMethods {
	
	public static void main(String[] args) {
		String firstWord =  "Java";
		String secondWord =  "Learning";
		String str = "Java Learning";
		String str1 = "JAVA LEARNING";
		String space = " ";
		//printing concatenation of 2 words
		System.out.println(firstWord.concat(space).concat(secondWord));
		System.out.println(firstWord.concat(space).concat(secondWord).length());
		System.out.println(firstWord.concat(space).concat(secondWord).replace('a','s'));
		
		String st = "This was my code,this was my eclipse";
		System.out.println(st.replaceAll("was","is"));
		
		System.out.println(firstWord.concat(space).concat(secondWord).compareTo(str));
		System.out.println(str.contains("earning"));
		System.out.println(secondWord.endsWith("g"));
		System.out.println(secondWord.endsWith("ing"));
		System.out.println(secondWord.endsWith("ed"));
		System.out.println(str.equals(str1));
		System.out.println(firstWord.concat(space).concat(secondWord).equals(str));
		System.out.println(str.equalsIgnoreCase(str1));
		
		String str3 = String.format("%d", 100);
		System.out.println(str3);
		
		String str4 = "This is for practice";
		System.out.println(str4.indexOf("is"));
		System.out.println(str4.indexOf("is",4));
	//method to print index of letter f in a string
		System.out.println(str4.indexOf('f'));
		
		String space1="";
		System.out.println(str.isEmpty());
		System.out.println(space1.isEmpty());
		
		System.out.println(String.join ("-","welcome"," to"," this"," world"));
		System.out.println(str4.replace(' ', '*'));

		System.out.println(str4.lastIndexOf("c"));
		System.out.println(str4.lastIndexOf("is",7));
		
		//System.out.println(str4.split("//s "));not understood

		System.out.println(str4.startsWith("This"));
		String str5 = " wecome To MY WORLD ";
		System.out.println(str5.substring(2));
		System.out.println(str5.substring(2,4));
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase());
		System.out.println(str5 + "sravanthi");   //without trim
		System.out.println(str5.trim() + "sravanthi");      //with trim
		
		//String Builder
		
		//String Builder Append
		StringBuilder sb = new StringBuilder("Java ");
		sb.append("learning");
		System.out.println(sb);
		
		//String Builder Insert
		StringBuilder sb1 = new StringBuilder("Automation");
		sb1.insert(3,"training");
		System.out.println(sb1);
		
		//String Builder replace
		StringBuilder sb2 = new StringBuilder("online");
		sb2.replace(1, 3, "class");
		System.out.println(sb2);
		
		//String Builder delete
		StringBuilder sb3 = new StringBuilder("Testing");
		sb3.delete(2,5);
		System.out.println(sb3);
		
		//String Builder Reverse
				StringBuilder sb4 = new StringBuilder("Testing");
				//sb4.reverse();
				System.out.println(sb4.reverse());
				
		//String Builder delete
				StringBuilder sb5 = new StringBuilder("Welcome To Java Class");
				//sb5.capacity();
				System.out.println(sb5.capacity());
		
		
	}

}
