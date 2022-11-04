package com.learning.automation.javalearning.sravanthi;
import java.util.*;
import java.io.*;
public class FileOperation {
public static void main(String[] args)  throws IOException {
	File file = new File("C:\\Users\\sravanthi.mallela9\\OneDrive\\Desktop\\TestAutomation\\file2021.txt");

	if (file.createNewFile()) {
		System.out.println("File Created: " + file.getName() + "  " + file.getAbsolutePath());
		}else {
		System.out.println("File already exists");
	}
	
	Scanner sc = new Scanner(file);
	while (sc.hasNextLine()) {
		System.out.println("File contents are: " + sc.nextLine());
		//String data = sc.nextLine();
		//System.out.println(data);
	}
	sc.close();
		
	FileWriter writer = new FileWriter(file);
	writer.append("Text from the console to the existing text");
	writer.close();
	sc = new Scanner(file);
	
	while(sc.hasNextLine()) {
		System.out.println(sc.nextLine());
		
	}
	
	sc.close();
	
}

}
