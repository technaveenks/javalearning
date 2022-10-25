package com.learning.automation.javalearning.malathi;


public class LoopsInJava {
	public static void main(String[] args) {
		String str="AA A SSs HJJ U Bs";
		int spacecount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')
				spacecount++;
			
		}
		System.out.println("Spacecount in the given string is: "+spacecount);
		int[] freq=new int[str.length()];
		System.out.println("\nEntered string is: "+str);
		char str1[]=str.toCharArray();
		System.out.println("\nNumber of occurences of each chacter in a given string excluding spaces");
		
		for(int i=0;i<str.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<str.length();j++) {
				if(str1[i]==str1[j]) {
					freq[i]++;
					//to avoid printing visited character
					str1[j]=' ';
			
					
					}
			}
			if(str1[i]!=' ')
			
			System.out.print("["+str1[i]+"," + freq[i]+"]  ");
			
			
		}
		int number=10;
		
		do {
			System.out.println("\nI am in do while loop" );
		} while (number>10);
		while(number<=10)
		{
			System.out.println("I am in while loop");
			number=++number;
		}
	}


}
