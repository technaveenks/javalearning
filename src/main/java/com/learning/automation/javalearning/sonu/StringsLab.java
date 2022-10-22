package com.learning.automation.javalearning.sonu;
import java.io.UnsupportedEncodingException;
import java.lang.*;
import java.util.Arrays;



public class StringsLab {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String book = "The Phoenix Project";
        String prac = "DevOps";
        String space = " ";
       //concat
        String concat = book.concat(space).concat(prac);
        System.out.println(concat);
        //length method
        System.out.println(concat.length());
        //toUppercase method
        System.out.println(concat.toUpperCase());
        //toLowercase
        System.out.println(concat.toLowerCase());
        //charAt
        char result = book.charAt(2);
        System.out.println(result);
        //codePointAt()
        int a = book.codePointAt(2);
        System.out.println(a);
        //compareTo()
        int b = book.compareTo(prac);
        System.out.println(b);
        //contains()
        System.out.println(true);
        System.out.println(prac.contains("t"));
        //endsWith()
        System.out.println(book.endsWith("t"));
        System.out.println(book.endsWith("project"));//case-sensitive
        System.out.println(book.endsWith("Project"));
        //indexOf
        System.out.println(book.indexOf("project"));//case-sensitive
        System.out.println(book.indexOf("Project"));
        //replace
        System.out.println(prac.replace("D","d"));
        //split
        System.out.println(Arrays.toString(book.split("n", 2)));
        //subString
        System.out.println(book);
        System.out.println(book.substring(1,10));
        System.out.println(book.substring(18,19));
        System.out.println(book.substring(4,13));
        //trim
        String d = "            Testing Trim                ";
        System.out.println(d);
        System.out.println(d.trim());
        //equalsIgnoreCase
        String x = "Testing";
        String y = "TESTING";
        String z = "Software";
        System.out.println(x.equalsIgnoreCase(y));
        System.out.println(y.equalsIgnoreCase(z));

        //StringBuilder


        StringBuilder sBuilder = new StringBuilder("Professor ");
        System.out.println("string= " + sBuilder);
        //append
        sBuilder.append("Nikola");
        System.out.println("After append = " + sBuilder);
        //capacity
        System.out.println(sBuilder.capacity());
        //trimToSize
        sBuilder.trimToSize();
        //after trimToSize
        System.out.println(sBuilder.capacity());
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("string= " + sb);
        sb.insert(3,"World");
        sb.reverse();
        System.out.println("after insert: " + sb);




    }
}
