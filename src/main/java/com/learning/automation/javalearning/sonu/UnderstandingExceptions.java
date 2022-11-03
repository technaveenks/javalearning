package com.learning.automation.javalearning.sonu;

import java.io.File;
import java.io.IOException;

public class UnderstandingExceptions {

    public static void main(String[] args) throws IOException {


        int num1 = 10;
        int num2 = 0;
        try {
            if (num2 == 0){
                throw new Exception("Entered value is zero for dividing number.");
            }
            int result = num1 / num2;
            System.out.println(result);

        }catch(ArithmeticException exception){
            exception.printStackTrace();
            System.out.println("Dividing number cannot be zero");

        }catch(Exception exception){
            System.out.println("Error Occurred and Program Exited");

        }finally {
            System.out.println("Finally block executed");
        }

        File file = new File("\"C:\\Users\\SonuP\\OneDrive\\Desktop\\Sample.txt.txt\"");
        if (file.createNewFile()){
            System.out.println("File Created "+file.getName() + " " + file.getAbsolutePath());

        }else {
            System.out.println("File Already Exists");
        }



    }
}