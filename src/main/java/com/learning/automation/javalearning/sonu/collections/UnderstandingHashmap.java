package com.learning.automation.javalearning.sonu.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UnderstandingHashmap {

    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        //OR Map map = new HashMap();
        map.put(1001, "Sharon");
        map.put(1002, "John");
        map.put(1002, "John");
        map.put(1003, "John");
        System.out.println(map);
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry values = (Map.Entry)iterator.next();
            System.out.println(values.getKey()+ "----"+values.getValue());
        }



        }


    }

