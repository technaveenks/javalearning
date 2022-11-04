package com.learning.automation.javalearning.sonu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\SonuP\\Sample.txt");
        if (file.createNewFile()) {
            System.out.println("File Created " + file.getName() + " " + file.getAbsolutePath());
        } else {
            System.out.println("File already exists");

        }

        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            System.out.println("File contents are " + scan.nextLine());
        }
        scan.close();

        FileWriter writer = new FileWriter(file);
        writer.append(" Text from console to the existing text");
        writer.close();
        scan = new Scanner(file);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}