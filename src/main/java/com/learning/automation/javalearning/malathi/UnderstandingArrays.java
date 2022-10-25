package com.learning.automation.javalearning.malathi;

public class UnderstandingArrays {
public static void main(String[] args) {
	String[][] studentsubjects= {{"c","c++","Java"},{"c++","java"},{"c","c++","java","python"},{"python"}};
	int n=0;
	for(String[] Student:studentsubjects) {
		++n;
		System.out.println("Subjects taken by Student "+n);
		for(String subjects:Student) {
			System.out.print(subjects+"\t");
			
		}
		System.out.print("\n");
		
	}
/*	Using nesting for loop
 * for(int i=0;i<studentsubjects.length;i++)
	{
	++n;
	System.out.println("Subjects taken by Student "+n);
		for(int j=0;j<studentsubjects[i].length;j++)
		{
		System.out.print(studentsubjects[i][j]+"\t");	}
	System.out.print("\n");
	}*/
}
}
