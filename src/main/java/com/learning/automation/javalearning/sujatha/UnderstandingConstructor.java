package com.learning.automation.javalearning.sujatha;

public class UnderstandingConstructor {
		int a,b,c;
public UnderstandingConstructor()
	{
		a=10;
		b=20;
		}
public UnderstandingConstructor(int a,int b)
	{
	this.a=a;
	this.b=b;
	}
 public void addition()
 	{
	 c=a+b;
	 System.out.println("The addition of two values  "+c);
 		}
	public static void main(String[] args) {
	UnderstandingConstructor constructors=new UnderstandingConstructor(5,4);
	constructors.addition();
	constructors=new UnderstandingConstructor();
	constructors.addition();
	}

}
