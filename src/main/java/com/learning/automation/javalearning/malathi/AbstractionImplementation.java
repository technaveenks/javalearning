package com.learning.automation.javalearning.malathi;

public class AbstractionImplementation extends AbstractMathematicalOperations 

{

	
	  @Override public void additon(int fvalue, int svalue) { 
	  // TODO Auto-generated method stub 
	  int result=fvalue+svalue;
	  System.out.println("Addition result:"+result);
	  
	  }
	 
	public static void main(String[] args) {
		AbstractionImplementation aimp=new AbstractionImplementation();
		aimp.additon(10, 20);
		aimp.multiplication(10,20);
		
	}
	}
