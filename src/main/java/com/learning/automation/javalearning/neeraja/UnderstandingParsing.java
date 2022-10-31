package com.learning.automation.javalearning.neeraja;

public class UnderstandingParsing {
	
	public static void parsingdifferentdatypes() {
      //convert string  to int
       String s="2019";
       System.out.println("String is s:"+s);
       int i=Integer.parseInt(s);
       System.out.println("After converting string to integer is:"+i);
       s+=1;
       i+=1;
       System.out.println(s);
       System.out.println(i);
       System.out.println("*****end******");
       
       //convert int to String
       System.out.println("**convert int to string program starts**");
       int i1=12435;
       String s1=Integer.toString(i1);
       System.out.println(s1);
       System.out.println(s1.getClass());
       System.out.println("*****end******");
       
       
       //convert string to char
         String s2="neeraja";
         char[] c1=s2.toCharArray();
         System.out.println(c1);
        char c2=c1[0];
         System.out.println(c2);
         
         System.out.println("*****end******");
       //convert char to String
         
         char c3='a';
         
         String s3=String.valueOf(c3);
         System.out.println(c3);
         System.out.println(s3.getClass());
         System.out.println("*****end******");
         
         //convert string to float
         
         String s4="23.6";
         float f1=Float.parseFloat(s4);
         System.out.println(s4);
     
         System.out.println("*****end******");
         
         //convert float to string
         
         float f2=7890.90f;
         String s5=String.valueOf(f2);
         System.out.println(f2);
         System.out.println(s5.getClass());
         System.out.println("*****end******");
         
         //convert string to double;
         String s6="7888910";
         double d1=Double.parseDouble(s6);
         System.out.println(d1);
         System.out.println("*****end******");
         
         
         
            //convert double to string
          double d2=89765.50;
          String s7=String.valueOf(d2);
          System.out.println(s7);
          System.out.println(s7.getClass());
          System.out.println("*****end******");
          
          //convert string to boolean;
          String s8="true";
          boolean b=Boolean.valueOf(s8);
          
         System.out.println(b);
         System.out.println("*****end******");
         
         //convert boolean to string;
         boolean b2=false;
         
         String s9=String.valueOf(b2);
         System.out.println(b2);
         System.out.println(s9.getClass());
         System.out.println("*****end******");
         
        //convert string to object
         
         String s10="hello";
         
         Object obj=s10;
         System.out.println(obj);
         System.out.println("*****end******");
         
         
         //convert object to String
         Object obj1=new Object();
         String s11=obj1.toString();
         System.out.println(s11);
         System.out.println(s11.getClass());
         System.out.println("*****end******");
         
         //convert string to date
         
         
         //convert date to string
         
       
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parsingdifferentdatypes();
		

	}

}
