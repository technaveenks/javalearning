package com.learning.automation.javalearning.sujatha;

public class MethodCreation {
int a=12;
int b=12;
public void addition(int x,int y)
{
	this.a=a;
	this.b=b;
	int c=a+b;
	System.out.println("The result :"+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodCreation methodcreation=new MethodCreation();
methodcreation.addition(4, 5); 
	}

}
