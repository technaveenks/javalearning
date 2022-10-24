package com.learning.automation.javalearning.sujatha;

public class UnderstandingMethods {

	int FirstValue=50;
	int SecondValue=10;
	
	public void Addtion()
	{
		int Result=FirstValue+SecondValue;
		System.out.println("Addition of Two Values "+ Result);
	}
	
	public void Subtraction()
	{
		int Result=FirstValue-SecondValue;
		System.out.println("Subtraction of Two Values "+ Result);
	}
	
	public void Multiplication(int a,int b)
	{
		int r=a*b;
		System.out.println("The result from method with parameter"+r);
	
		//int Result=FirstValue*SecondValue;
		//System.out.println("Multiplication of Two Values "+ Result);
	}
	
	
	public void Division()
	{
		int Result=FirstValue/SecondValue;
		System.out.println("Division of Two Values "+ Result);
	}
	
	public void Modulo()
	{
		int Result=FirstValue%SecondValue;
		System.out.println("Modulo of Two Values "+ Result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnderstandingMethods understandingMethods=new UnderstandingMethods();
		System.out.println("Understanding Of Methods"+"\n");
		
		understandingMethods.Addtion();
		understandingMethods.Subtraction();
		understandingMethods.Multiplication(2,3);
		understandingMethods.Division();
		understandingMethods.Modulo();
		
		}

}
