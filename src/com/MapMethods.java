package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {
		
		   Map<Integer,String>map= new HashMap<Integer, String>();	   
		   map.put(1, "Aaditya");
		   map.put(2, "Sudhakar");
		   map.put(3, "Patil");
		   
		   Set set= map.entrySet();
		   System.out.println(set);
		   
		   Set<Integer> keyset= map.keySet();
		   
		   for(Integer i : keyset)
		   {
			   System.out.println("key is " + i);
		   } 
		   
		   map.replace(1,"Aaditya", "Akshay");
		   map.remove(1,"Akshay");
		   Iterator itr= set.iterator();
		   while(itr.hasNext())
		   {
			   Map.Entry entry= (Map.Entry)itr.next();
			   System.out.println(entry.getKey() + " key and value " + entry.getValue());
		   }
		   
		   for(Map.Entry m: map.entrySet())
		   {
			   System.out.println(m.getKey() + " key and value " + m.getValue());
		   }
		  
	}

}
