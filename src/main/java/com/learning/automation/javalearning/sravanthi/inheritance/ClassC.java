package com.learning.automation.javalearning.sravanthi.inheritance;

public class ClassC extends  ClassA{
	
	public void methodC() {

	System.out.println("This is method C from Class C");
	
}

	public static void main(String[] args) {
		ClassC cc = new ClassC();
		cc.methodA();
		cc.methodZ();
		cc.methodC();
		
	}
}