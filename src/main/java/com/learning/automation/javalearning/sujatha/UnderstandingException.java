package com.learning.automation.javalearning.sujatha;

public class UnderstandingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int fvalue=10;
 int svalue=0;
 
 try {
 int result=fvalue/svalue;
 System.out.println(result);
 }
 catch(Exception exception)
 {
	System.out.println("error occured and program exited"); 
 }
 finally {
	 System.out.println("Finally Block Exceuted");
 }
 
	}

}
