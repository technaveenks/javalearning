package com.learning.automation.javalearning.sravanthi;

public class PrintingMDArrayValuesAsGroup {
	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Printing values of MultiDimensional Int Array : ");
            for (int i=0;i<3;i++) {
			for(int j=0 ; j<3;j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println(" ");
		}
		
		String  multiString[][] = {{"Cricket","FootBall","Soccer","Tennis","BasketBall"},{"Java","Eclipse","Jira","Git","Maven"},{"India","USA","UK","Malasia","Australia"}};
		System.out.println("One of the value is : " +multiString[1][3]);
		System.out.println("Length of Multi Dimensinal Array is :  " + multiString.length);
		
		System.out.println("Printing values of MultiDimensional String Array : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(multiString[i][j] + ": ");
			}
			System.out.println("  ");
		}
	}

}
