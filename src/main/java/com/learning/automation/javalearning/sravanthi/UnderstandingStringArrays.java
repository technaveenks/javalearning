package com.learning.automation.javalearning.sravanthi;

public class UnderstandingStringArrays {
	public static void main(String[] args) {
		//Single Dimensional String array
		String states[] = {"Texas","Maryland","Chicago","California","Florida"};
		System.out.println("One of the  state is : " +states[3]);
		System.out.println("Length of single dimensional string array is : " +states.length);
		
		System.out.println("Printing values of Single Dimensional Array is : ");
		for (String ListStates:states) {
			System.out.println("*** " +ListStates);
		}
		
		//Multi Dimensional String array
		String  multiString[][] = {{"Cricket","FootBall","Soccer","Tennis","BasketBall"},{"Java","Eclipse","Jira","Git","Maven"},{"India","USA","UK","Malasia"}};
		System.out.println("One of the value is : " +multiString[1][3]);
		System.out.println("Length of Multi Dimensinal Array is :  " + multiString.length);
		
		System.out.println("Printing values of MultiDimensional Array : ");
		for(String[] RetreiveValues:multiString){
			for(String PrintValues:RetreiveValues) {
				System.out.println("--"+PrintValues);
				
			}
			
		}
		
		
		
		
		
	}

}
