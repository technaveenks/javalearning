package com.learning.automation.javalearning.sonu;

public class CastingAssignment {


    public static void main(String[] args) {


        // Int to Long
        int i = 785;
        long lo = i;
        System.out.println(lo);

        //Long-Int
        long l = 564;
        int it = (int)l;
        System.out.println(it);

        //	Int-double
        int a = 56;
        double d = a;
        System.out.println(d);

        //	Double-int
        double y = 89.7;
        int b = (int)y;
        System.out.println(b);
        //	Char-int
        char c = 'z';
        int h = c;
        System.out.println(h);

        //	Int-char
        int p = 9;
        char ch = '9';

        System.out.println((int)ch);
        //	byte-short
        byte o = 6;
        short sh = o;
        System.out.println(sh);
        //	Short- byte
        short or = 67;
        byte te = (byte) or;
        System.out.println(te);
        //	Byte-int
        byte f = 7;
        int se = f;
        System.out.println(se);

        //	Int - byte
        int sm = 23;
        byte ye = (byte) sm;
        System.out.println(ye);

       //	string - int
        String s = "86";
        int nt = Integer.parseInt(s);
        System.out.println(nt);


       //	int-string
        int one = 45;
        String ones = Integer.toString(one);
        System.out.println(ones);

       // 	string – long
        String alpha = "4586";
        long el = Long.parseLong(alpha);
        System.out.println(el);

        //	long- string
        long ng = 1234L;
        String ring = String.valueOf(ng);
        System.out.println(ring);

        //	string-float
        String val = "9000";
        float oat = Float.parseFloat(val);
        System.out.println(oat);

        //	float-string
        float at = 45.5f;
        String app = String.valueOf(at);
        System.out.println(app);

        //	string-double
        String ship = "57876";
        double ble = Double.parseDouble(ship);
        System.out.println(ble);

        //	double- string
        double five = 889343;
        String tri = String.valueOf(five);
        System.out.println(five);
        //	string-char
        String gale = "5";
        char value = gale.charAt(0) ;
        System.out.println(value);
        //	char-string
        char ha = 'r';
        String sa = String.valueOf(ha);
        System.out.println(sa);
        //	string-object
        String strings = "hello";
        Object obj = strings;
        System.out.println(obj);
        //	object- string

        Object j = new Object();
        String k = j.toString();
        String k1 = String.valueOf(j);
        System.out.println(k);
        System.out.println(k1);

    }
}
