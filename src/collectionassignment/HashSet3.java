package collectionassignment;

import java.util.HashSet;

//3. Write a Java program to copy all of the mappings from the specified map to another map. 

public class HashSet3 {

	public static void main(String[] args) {
		
		
		HashSet<String> hset= new HashSet<String>();

		hset.add("Aaditya");
		hset.add("Mohit");
		hset.add("Pankaj");
		hset.add("Akshay");
		hset.add("Rohit");

		System.out.println("The given HashSet is " + hset);

		System.out.println("The size of hashset is " + hset.size());

	}

}
