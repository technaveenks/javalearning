package com.learning.automation.javalearning.sujatha;

public class UndestandingTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array= {3,6,2,1,9,10,44};
		
		try{
			for(int i=0;i<=array.length;i++)
		
			{
			System.out.println(array[i]);
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("This is catch block");
		}
		finally
		{
			System.out.println("This is from finally block");
		}
	}

}
