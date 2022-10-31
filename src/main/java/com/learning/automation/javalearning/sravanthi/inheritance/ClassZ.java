package com.learning.automation.javalearning.sravanthi.inheritance;

public class ClassZ {
	
	public void methodZ() {
		System.out.println("This is method Z form Class Z");
		
		int x=5,y=10,div;
		div= y / x;
		System.out.println("Division of two nos: " + div);
		
	}
	
	public static void main(String[] args) {
		ClassZ cz = new ClassZ();
		cz.methodZ();
	}
	

}
