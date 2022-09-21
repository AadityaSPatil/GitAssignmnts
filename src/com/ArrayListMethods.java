package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list= new ArrayList<String>();
		list.add("Aaditya is");
		list.add("Automation");
		list.add("Test");
		list.add("Engineer");
		
		System.out.println(list);
		
		Iterator itr= list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		list.set(1, "Manual");
		
		Collections.sort(list);
		
		System.out.println(list.get(0).contains("a"));
		
		for(String str: list)
		{
			System.out.println(str);
		}
		
		
		

	}

}
