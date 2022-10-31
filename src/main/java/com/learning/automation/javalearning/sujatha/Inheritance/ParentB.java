package com.learning.automation.javalearning.sujatha.Inheritance;

public class ParentB extends GrandParentA{
	public void MethodB()
	{
		System.out.println("This method is from Parent");
	}
	public static void main(String[] args) {
		ParentB Bobj=new ParentB();
		Bobj.MethodA();
		Bobj.MethodB();
		Bobj.MethodZ();
	}

}
