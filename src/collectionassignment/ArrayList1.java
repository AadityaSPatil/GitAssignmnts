package collectionassignment;

import java.util.ArrayList;

//1.Write a Java program to create a new array list, add some colors (string) and print out the collection

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String>list= new ArrayList<String>();
		
		list.add("Blue");
		list.add("red");
		list.add("orange");
		list.add("yellow");
		list.add("pink");
		
		System.out.println(list);

	}

}
