package com;

public class StringProgram5 {
	
//5. Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="This is Aaditya 1";  
		String str2="This is Aaditya 2";    
		
		System.out.println(str1);
		System.out.println(str2);
		
		int result= str1.compareToIgnoreCase(str2);
				
		if(result <0)
		{
			System.out.println(str1 + " is less than " + str2);
		}
		
	
	}

}
