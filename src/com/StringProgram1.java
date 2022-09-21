package com;

public class StringProgram1 {
	
	//1.Write a Java program to get the character at the given index within the String

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Java Exercises!";
		
		System.out.println("Orignal String is = " + str);
		
		char ch= str.charAt(0);
		
		char ch1= str.charAt(10);
		
		System.out.println("The character at position 0 is " + ch);
		
		System.out.println("The character at position 10 is " + ch1);
		
	}

}
