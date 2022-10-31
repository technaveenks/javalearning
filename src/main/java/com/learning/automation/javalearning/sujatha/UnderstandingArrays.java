package com.learning.automation.javalearning.sujatha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnderstandingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {2,3,1,5,9,6};
		System.out.println(a.length);
		System.out.println(a[4]);
		//Displaying Array Data-
		for(int b:a)
		{
			System.out.println("*"+b);
		}
		//Array with String Datatype
		String s[]= {"surya","Karthik","Vinodh","Raja","Ram"};
		
		
		for(String s1:s) {
					//System.out.println(s1.toCharArray());
					System.out.println(s1);
		}
		
		//Multidimensional array
		int x[][]= {{2,3,4,5},{9,8,7,6},{4,6,7,8}};
		System.out.println("**"+x[2][2]);
		for(int [] y:x)
		{
			for(int z:y)
			{
				System.out.print(z);
			}
		}
		
			//Multidimensionsal String Array
		String stringarray[][]= {{"uma","radhi","radha","sam"},{"soni","girija","uma2","nayan"},{"happy","fara","sara","tara"}};
int n=0;
		for(String []sarray:stringarray)
		{
			++n;
			System.out.println(n);
			for(String sarrayvalues:sarray)
			{
				System.out.println("!!"+sarrayvalues+"\t");
			}
			System.out.println("\n");
		}
	}

}
