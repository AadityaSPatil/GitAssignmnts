package com;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class SetMethods {
       public static void main(String[] args) {
		
		Set<Integer> set= new LinkedHashSet<Integer>();
		set.add(11);
		set.add(33);
		set.add(22);
		set.add(99);
		set.add(55);
		System.out.println("Given data print " + set);
		System.out.println("Given data size is " + set.size());
		
		Iterator itr= set.iterator();
		while(itr.hasNext())
		{
			System.out.println("Itertor value is " + itr.next());
		}
		
		System.out.println("The data are not inserted " + set.contains(44));
		System.out.println("The data are inserted " + set.contains(11));
		
		Set<Integer> set1= new LinkedHashSet<Integer>();
		set1.add(11);
		set1.add(33);
		set1.add(22);
		
		System.out.println("check data are inserted/not inserted " + set.containsAll(set1));
		
		System.out.println("The hash code value is " + set1.hashCode());
		
		System.out.println("The data is empty? = " + set1.isEmpty());
		
		System.out.println("The data is remove = " + set1.remove(33));
		
		System.out.println("The data is all remove = " + set1.removeAll(set1));
		set.clear();
        System.out.println("The data is clear " + set);
	}

}
