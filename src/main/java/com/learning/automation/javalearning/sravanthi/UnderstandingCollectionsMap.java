package com.learning.automation.javalearning.sravanthi;

import java.util.*;

public class UnderstandingCollectionsMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap();
		map.put(60006, "Martin");
		map.put(60009, "King");
		System.out.println(map);
		Iterator iterator = map.entrySet().iterator();
		//System.out.println("Iterator values: " + iterator);
		while(iterator.hasNext()) {
			System.out.println("Iterator values: " + iterator);

			Map.Entry values = (Map.Entry)iterator.next();
			//System.out.println("Values are: " + values);
			System.out.println(values.getKey()+"------" + values.getValue());
			
		}
	}
}
