package collectionassignment;

import java.util.HashMap;

//2.Write a Java program to count the number of key-value (size) mappings in a map.

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "Tester");
		hmap.put(2, "Developer");
		hmap.put(3, "Team Leader");
		hmap.put(4, "Manager");
		hmap.put(5, "CEO");
		
		System.out.println("size of hashmap is " + hmap.size());

	}

}
