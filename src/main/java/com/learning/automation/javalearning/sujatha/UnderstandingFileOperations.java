package com.learning.automation.javalearning.sujatha;

import java.io.File;
import java.io.IOException;

public class UnderstandingFileOperations {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

		File file=new File("C:\\October22\\AdvancedJava\\Sample1.txt");
		if(file.createNewFile())
		{
			System.out.println("File Created "+ file.getName()+ " " + file.getAbsolutePath());
		}
		else
		{
			System.out.println("File already exists");
		}
	}

}
