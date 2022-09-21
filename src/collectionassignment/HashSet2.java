package collectionassignment;

import java.util.HashSet;
import java.util.Iterator;

//2. Write a Java program to count the number of key-value (size) mappings in a map

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       HashSet<String> hset= new HashSet<String>();
		
		hset.add("Aaditya");
		hset.add("Mohit");
		hset.add("Pankaj");
		hset.add("Akshay");
		hset.add("Rohit");
		
		Iterator<String> itr = hset.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
