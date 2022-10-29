package com.learning.automation.javalearning.sonu;

public class CastingLab {

    public static void main(String[] args) {

        int a = 35;
        float f = 23.4f;
        int sum = (int) (a + f);
        System.out.println(sum);

        String number = String.valueOf(a);
        System.out.println(a);
        System.out.println(number.getClass());
        //float to String
        String s = "89.2";
        float val1 = 21.3f;
        //String to float
        float total = Float.parseFloat(s);
        System.out.println(total + val1);
        float val = Float.parseFloat(s);
        System.out.println(val);
        System.out.println(s.getClass());

        //int-long
        int x = 6;
        int y = 58;
        long lo = x + y;
        System.out.println(lo);



    }



    }

