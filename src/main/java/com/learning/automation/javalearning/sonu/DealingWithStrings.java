package com.learning.automation.javalearning.sonu;

public class DealingWithStrings {
    public static void main(String[] args) {


        int num = 56;
        String x = "56";
        Object type;
        System.out.println(num);
        System.out.println(x.getClass());

        String result1 = String.valueOf(num);
        System.out.println(result1.getClass());
        String result = Integer.toString(num);
        System.out.println(result.getClass());

        StringBuilder sb = new StringBuilder();
        sb.append(num);

        type = sb;
        System.out.println(type.getClass());
    }

}
