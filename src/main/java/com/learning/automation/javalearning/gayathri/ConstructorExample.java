package com.learning.automation.javalearning.gayathri;

public class ConstructorExample {
	int a,b;
	public ConstructorExample() {
	 a = 30;
		  b = 20;
	}
	 public ConstructorExample(int a,int b) {
		this.a =a;
		this.b =b;
	 }
	 public void subtraction() {
		 int diff = a-b;
		 System.out.println("the subtraction of two numbers is: " +diff);
		 
	 }
	public static void main(String[] args) {
		ConstructorExample con = new ConstructorExample(90,60);
		con.subtraction();
		con = new ConstructorExample();
		con.subtraction();
	}

}
