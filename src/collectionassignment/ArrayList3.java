package collectionassignment;

import java.util.ArrayList;

//3. Write a Java program to insert an element into the array list at the first position.

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list= new ArrayList<String>();
		
		list.add("Blue");
		list.add("red");
		list.add("orange");
		list.add("yellow");
		list.add("pink");
		
		System.out.println(list);
		
		list.add(0, "white");
		list.add(2, "black");
		list.add(4, "green");
		
		System.out.println(list);


	}

}
