package com.learning.automation.javalearning.gayathri.inheritance;

public class ClassC extends ClassA {
	
	public void methodc() {
		System.out.println("this is method from Class C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC c = new ClassC();
		c.methodc();
		c.methodfromA();
		c.methodz();
		

	}

}
