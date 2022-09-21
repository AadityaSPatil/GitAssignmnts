package com;

public class StringProgram3 {
	
//3.Write a Java program to get the character (Unicode code point) before the specified index within the String.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str="w3resource.com ";
		
		System.out.println("This is a given string " + str);
		
		int unicode=str.codePointBefore(1);
		int unicode1=str.codePointBefore(9);
		
		System.out.println("character(Unicode Point)" + unicode);
		System.out.println("character(Unicode Point)" + unicode1);

	}

}
