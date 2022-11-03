package com.learning.automation.javalearning.sujatha.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnderstandingListSetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LIST 
		List<String> listobj=new ArrayList<String>();
		listobj.add("sunflower");
		listobj.add("jasmine");
		listobj.add("rose");
		listobj.add("lilly");
		listobj.add("hibiscus");
		//listobj.add(12);
		System.out.println(listobj);
		
		//To remove for list
		listobj.remove(2);
		 
		
		//to add in particular index
		listobj.add(2,"Rose");
		
		Iterator iteratorobj=listobj.iterator();
		while(iteratorobj.hasNext()) 
		{
			System.out.println(iteratorobj.next());
		}
		
		
		Collections.sort(listobj,Collections.reverseOrder());
		System.out.println(listobj);
		
		//SET
		
		System.out.println("SET");
				
			
		Set<String> setobj=new HashSet<String>();
		setobj.add("45");
		setobj.add("12");
		setobj.add("5");
		setobj.add("2");
		setobj.add("90");
		setobj.add("5");//it won't allow duplicates
		System.out.println(setobj);
		System.out.println("From set Collection");
		Iterator setiterator=setobj.iterator();
		while(setiterator.hasNext())
		{
		System.out.println(setiterator.next());
		}
		
		//Collections.sort(setobj,Collections.reverse(listobj));
		
		
		//MAP
		
		Map<Integer,String> mapobj=new  HashMap<Integer,String>();
		
		mapobj.put(1,"JAVA1");
		mapobj.put(2,"C++");
		mapobj.put(3,"C");
		mapobj.put(4,"HTML");
		mapobj.put(5,"PHYTHON");
		mapobj.put(6,"VB");
		System.out.println(mapobj);
		
		Iterator iterator=mapobj.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry values=(Map.Entry)iterator.next();
			System.out.println(values.getKey()+"   "+ values.getValue());
		}
		
		
	}

}
