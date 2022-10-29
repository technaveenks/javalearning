package com.learning.automation.javalearning.malathi;

public class UnderstandingParsingInJava {
	public static void main(String[] args) {
		
		//String-int , int-String 
		int intnumber=20;
		String str=String.valueOf(intnumber);
		System.out.println("String value is: "+str+"\t datatype is:"+str.getClass().getSimpleName());
		intnumber=Integer.parseInt(str);
		System.out.println("Integer value is:"+intnumber);
		
		//String-long , long-string
		long longnumber=1234;
		String str1=String.valueOf(longnumber);
		System.out.println("String value is: "+str1+"\t datatype is:"+str1.getClass().getSimpleName());
		longnumber=Long.parseLong(str1);
		System.out.println("Longnumber value is:"+longnumber);
		
		//String-float , float-string
		float floatnumber=123.4f;
		String str2=String.valueOf(floatnumber);
		System.out.println("String value is: "+str2+"\t datatype is:"+str2.getClass().getSimpleName());
		floatnumber=Float.parseFloat(str2);
		System.out.println("Floatnumber value is:"+floatnumber);
		
		//String-Double , Double-string
		double doublenumber=123.456;
		String str3=String.valueOf(doublenumber);
		System.out.println("String value is:"+str3);
		doublenumber=Double.parseDouble(str3);
		System.out.println("String value is: "+str3+"\t datatype is:"+str2.getClass().getSimpleName());
		
		//String-object , object-string
		String str4="Hello";
		Object object=str4;
		System.out.println("Object value is:"+str4);
		object=str2;
		str4=String.valueOf(object);
		System.out.println("String value is: "+str4+"\t datatype is:"+str4.getClass().getSimpleName());
		
		//String-boolean , boolean to String
		String str5="True";
		boolean b=Boolean.parseBoolean(str5);
		System.out.println("Boolean value is:"+b);
		b=false;
	    str5=String.valueOf(b);
	    System.out.println("String value is: "+str5+"\t datatype is:"+str5.getClass().getSimpleName());
		
	}

}
