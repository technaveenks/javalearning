package com.learning.automation.javalearning.sujatha;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class UnderstandingParsing {

	public static void main(String[] args) throws Exception {
		
		String sint="100";
		String string="Qa Automation";
		char c='J';
		long l=7;
		double db=8.9;
		float fl=5.0f;
		//String to Object
		Integer intnum=new Integer(Integer.valueOf(sint));
		System.out.println("String to Float:"+Float.valueOf(sint));
		//System.out.println("***"+Integer.valueOf(sint));
		System.out.println("String to Integer:"+intnum);
			
		
		
			//Integer to String
		
				Integer.parseInt(sint);
				System.out.println(sint.getClass());
		
		
			//String is converted to Integer
				System.out.println(Integer.parseInt(sint)+4);
		
			//String to Long
				System.out.println(Long.parseLong(sint));
		
			
			//Long to String
				System.out.println("***"+String.valueOf(l).getClass());
		
			
			//String to Double
				System.out.println(Double.parseDouble(sint));
		
			
			//Double to String
				System.out.println(String.valueOf(db).getClass());
		
			
			//String to Float
				System.out.println(Float.parseFloat(sint));
		
			
			//Float to String
				System.out.println(String.valueOf(fl));
		
			
			//String to Boolean
				System.out.println(Boolean.parseBoolean(sint));
		
			
			//String to Date
				String sdate="31/12/2001";
				SimpleDateFormat f=new SimpleDateFormat("dd/mm/yyyy");
				Date date1=f.parse(sdate);
				System.out.println("String to Date-->" +" "+sdate+"\t"+date1);
		
			
			
			//Char to String
		String chS=String.valueOf(c);
		System.out.println(chS);
		
		
		
		
		
		
	}

}
