package com.learning.automation.javalearning.sravanthi;

public class UnderstandingParsingDatatypes {
	
	public static void main(String[] args) {
		
		//Parsing from String-int
		System.out.println("Converting string to int:");
		String s1 = "1234";
		int i1 = Integer.parseInt(s1);
		System.out.println("String: " +s1);
		System.out.println("int: " + i1);
		
		//Parsing from int-string
				System.out.println("Converting int to string :");
				int i2 = 1234;
				String s2 = Integer.toString(i2);
				System.out.println("int: " +i2);
				System.out.println("string: " + s2);
				
				//Parsing from String-long
				System.out.println("Converting string to long:");
				String s3 = "1234";
				long l1 = Long.parseLong(s3);
				System.out.println("String: " +s3);
				System.out.println("Long: " + l1);
				
				//Parsing from long-string
				System.out.println("Converting long to string:");
				long l2 = 1234;
				String s4 = Long.toString(l2);
				System.out.println("long: " +l2);
				System.out.println("string: " + s4);
				
				//Parsing from String-float
				System.out.println("Converting string to float:");
				String s5 = "1234";
			    float f1 = Float.parseFloat(s5);
				System.out.println("String: " +s5);
				System.out.println("Float: " + f1);
				
				//Parsing from float-String
				System.out.println("Converting float to string:");
				float f2 = 1234.5f;
				String s6 = String.valueOf(f2);
				System.out.println("float: " +f2);
				System.out.println("string: " + s6);
				
				//Parsing from String-double
				System.out.println("Converting string to double:");
				String s7 = "1234";
				double d1 = Double.parseDouble(s7);
				System.out.println("String: " +s7);
				System.out.println("Double: " + d1);
				
				//Parsing from double-String
				System.out.println("Converting  double to string:");
				double  d2 = 1234;
				String s8 = String.valueOf(d2);
				System.out.println("Double: " +d2);
				System.out.println("String : " + s8);
				
				//Parsing from String-char
				System.out.println("Converting string to char:");
				String s9 = "Testing";
			    char c1 = s9.charAt(0);
				System.out.println("String: " +s9);
				System.out.println("char: " + c1);
				
				//Parsing from char-string
				System.out.println("Converting char to string:");
				char c2 = 'T';
			    String  s10= String.valueOf(c2);
				System.out.println("Char: " +c2);
				System.out.println("String: " + s10);
				
				//Parsing from String-Object
				System.out.println("Converting string to object:");
				String s11 = "12";
			    Object ob1 = s11;
				System.out.println("String: " +s11);
				System.out.println("Object: " + ob1);
				
				//Parsing from object - String
				System.out.println("Converting object to string:");
			    Object ob2 = new Object();
                 String s12 = String.valueOf(ob2);
			    System.out.println("Object: " +ob2);
				System.out.println("String : " + s12);
				
				// Parsing from string- Boolean
				String s13="35";
				Boolean bv = Boolean.valueOf(s13);
				System.out.println(bv);
				
				//Parsing from boolean to String
				String s14 = "true";
				Boolean bv1 = Boolean.valueOf(s14);
				System.out.println(bv1);
						
	}

}
