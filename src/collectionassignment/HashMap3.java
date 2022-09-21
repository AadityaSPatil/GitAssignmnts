package collectionassignment;

import java.util.HashMap;

//3.Write a Java program to copy all of the mappings from the specified map to another map.

        public class HashMap3 {

	    public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Tester");
		hmap.put(2, "Developer");
		hmap.put(3, "Team Leader");

		System.out.println("Values in first map: " + hmap);

		HashMap<Integer, String> hmapp = new HashMap<Integer, String>();

		hmapp.put(4, "Manager");
		hmapp.put(5, "Head");
		hmapp.put(6, "CEO");

		System.out.println("values in second map: " + hmapp);

		hmapp.putAll(hmap);

		System.out.println("now all value add in second map " + hmapp);	

	}

}
