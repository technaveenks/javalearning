package com.learning.automation.javalearning.gayathri.inheritance;

public class ClassB extends ClassA{

	public void methodB() {
    System.out.println("this is the method from class B");
      }
     public static void main(String[] args) {
		ClassB b = new ClassB();
		b.methodB();
		b.methodfromA();
		b.methodz();
	}
	}


