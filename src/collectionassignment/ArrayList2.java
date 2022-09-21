package collectionassignment;

import java.util.ArrayList;
import java.util.Iterator;

//2. Write a Java program to iterate through all elements in a array list.

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<String>list= new ArrayList<String>();
		
		list.add("Blue");
		list.add("red");
		list.add("orange");
		list.add("yellow");
		list.add("pink");
		
		for(String s: list)
		{
			System.out.println(s);
		}
		
		Iterator itr= list.iterator();
		
	    while(itr.hasNext());
		{
			System.out.println(itr.next());
		}

	}

}
