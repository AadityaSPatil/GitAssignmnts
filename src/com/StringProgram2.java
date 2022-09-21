package com;

public class StringProgram2 {
	
//2. Write a Java program to get the character (Unicode code point) at the given index within the String

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="w3resource.com ";
		
		System.out.println("This is a given string " + str);
		
		int unipoint= str.codePointAt(1);
		int unipoint1= str.codePointAt(3);
		
		System.out.println("character(Unicode Point)" + unipoint);
		System.out.println("character(Unicode Point)" + unipoint1);

	}

}
