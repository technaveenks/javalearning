package com.learning.automation.javalearning.jhansi;

public class MultidimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array syntax: datatype, Variable []
		String names [] []= {{"Gayathri", "Jhansi", "Malathi", "Neeraja", "Saritha", "Sonu", "Sravanthi",
				"Sujatha", "Swathi", "Ujwala"}, {"A","B","C","D","E","F" , "G", "H", "I"}};
		System.out.println(names[0][1] + " "+ (names[1][1]));
		//System.out.println(names[1][1]);
		System.out.println(names.length);
		
		//using For loop: syntax- (statement1, statement 2, statement 3)
		//Statement 1 is executed (one time) before the execution of the code block.
		//Statement 2 defines the condition for executing the code block.
		//Statement 3 is executed (every time) after the code block has been executed.

		
			for (int j=0; j<9; j++) {
				System.out.println(names[0][j] + " "+ (names[1][j]));	
			}
		}
}