package collectionassignment;

import java.util.HashMap;
import java.util.Map;

//1.Write a Java program to associate the specified value with the specified key in a HashMap.

    public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "Tester");
		hmap.put(2, "Developer");
		hmap.put(3, "Team Leader");
		hmap.put(4, "Manager");
		hmap.put(5, "CEO");
		
		for(Map.Entry h:hmap.entrySet()){
		{
			System.out.println(h.getKey() +" " + h.getValue());
		}

	}


}
}