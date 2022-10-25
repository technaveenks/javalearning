package com.learning.automation.javalearning.malathi;

public class UnderstandingConstructors {
	
	int firstnumber;
	int secondnumber;
	public UnderstandingConstructors() {
		// TODO Auto-generated constructor stub
		firstnumber=10;
		secondnumber=20;
		System.out.println("Default constructor is called here");
	}
	public UnderstandingConstructors(int firstnumber,int secondnumber){
		this.firstnumber=firstnumber;
		this.secondnumber=secondnumber;
		System.out.println("Parametarized constructor is called here");
		
	}
	
public void add() {
	int sum=firstnumber+secondnumber;
	System.out.println("Sum of two given numbers: "+sum);
}
public int add(int a,int b) {
	int sum=a+b;
	System.out.print("Overloaded add method is called here and the sum is:");
	return sum;
	}
public static void main(String[] args) {
	UnderstandingConstructors understandingConstructors=new UnderstandingConstructors();
	understandingConstructors.add();
	UnderstandingConstructors understandingConstructors2=new UnderstandingConstructors(50,40);
	understandingConstructors2.add();
	System.out.print(understandingConstructors.add(2,3));
}

}
