package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicate {

	public void DuplicateCharacetFind(String str)
	{
		Map<Character, Integer> hmap =new HashMap<Character, Integer>();

		char ch[]= str.toCharArray();

		for(Character chr : ch)
		{
			if(hmap.containsKey(chr))
			{
				hmap.put(chr, hmap.get(chr)+1);
			}
			else
			{
				hmap.put(chr, 1);
		
			}}

			Set<Character> keys= hmap.keySet();

			for(Character c: keys)
			{
				if(hmap.get(c)>1)
				{
				  System.out.println("Duplicate character is " + hmap.get(c) + " repeated " + c);
				}
			}      
		}	

	public static void main(String[] args) {
		   
		  PrintDuplicate rd= new PrintDuplicate();
     	  rd.DuplicateCharacetFind("**//Software Engineer//**");

	}
}
