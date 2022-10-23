package com.learning.automation.javalearning.malathi;

public class UnderstandingStrings {
	public static void main(String[] args) {
		int value=100;
		Object object=new Object();
		object=value;
		System.out.println("object data type is: "+object.getClass()+"\n and the value is: "+object);
		
		String string=object.toString();
		object=string;

		System.out.println("Now the data type changed to: "+object.getClass().getSimpleName()+" \nand the value is: "+object);
		object=1.94f;
		System.out.println("Now the data type changed to: "+object.getClass().getName()+"\n and the value is: "+object);
		object=3.746;
		System.out.println("Now the data type changed to: "+object.getClass().getName()+"\n and the value is: "+object);
		string =String.valueOf(object);
		StringBuilder builder=new StringBuilder();
		builder.append(string);
		object=builder;
		System.out.println("Now the datatype Changed to: "+object.getClass().getName()+"\n and the value is: "+object);
		
		System.out.println("buider capacity is: "+builder.capacity());
		builder.trimToSize();
		System.out.println("buider capacity is: "+builder.capacity());
		builder.append("78");
		System.out.println("buider capacity is: "+builder.capacity());
		System.out.println("builder length is: "+builder.length());
		System.out.println("builder in reverse: "+builder.reverse());
	}

}
