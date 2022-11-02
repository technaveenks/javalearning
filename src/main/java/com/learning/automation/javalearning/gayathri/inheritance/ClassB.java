package com.learning.automation.javalearning.gayathri.inheritance;

//import the package automatically when we access the methods from outside the package

import com.learning.automation.javalearning.gayathri.MethodExample1;

public class ClassB extends ClassA{

	public void methodB() {
    System.out.println("this is the method from class B");
      }
     public static void main(String[] args) {
		ClassB b = new ClassB();
		b.methodB();
		b.methodfromA();
		b.methodz();
		
		//Accessing the methods from different package
		
		MethodExample1 methods = new MethodExample1();
	    methods.addition();
	}
	}


