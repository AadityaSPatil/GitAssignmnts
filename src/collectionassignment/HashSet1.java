package collectionassignment;

import java.util.HashSet;

//1. Write a Java program to associate the specified value with the specified key in a HashMap.

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hset= new HashSet<String>();
		
		hset.add("Aaditya");
		hset.add("Mohit");
		hset.add("Pankaj");
		hset.add("Akshay");
		hset.add("Rohit");
		
		System.out.println("The hashset value is " + hset);
		
		

	}

}
