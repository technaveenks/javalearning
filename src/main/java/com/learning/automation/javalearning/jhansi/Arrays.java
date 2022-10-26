package com.learning.automation.javalearning.jhansi;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array syntax: datatype, Variable []
		String names [] = {"Gayathri", "Jhansi", "Malathi", "Neeraja", "Saritha", "Sonu", "Sravanthi",
				"Sujatha", "Swathi", "Ujwala"};
		System.out.println(names[1]);
		System.out.println(names.length);
		
		//using For loop: syntax- (statement1, statement 2, statement 3)
		//Statement 1 is executed (one time) before the execution of the code block.
		//Statement 2 defines the condition for executing the code block.
		//Statement 3 is executed (every time) after the code block has been executed.

		for (int i=0; i<9; i++) {
			String qateam= names [i]; 
			System.out.println(qateam);	
		}
	}

}
