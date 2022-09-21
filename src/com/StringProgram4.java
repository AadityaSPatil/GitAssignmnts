package com;

public class StringProgram4 {
	
//4. Write a Java program to count a number of Unicode code points in the specified text range of a String

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str="w3resource.com ";
		
		System.out.println("This is a given string " + str);
		
		CharSequence seq= "w3resources";
		
		int set=2;
		
		int count=11;
		
		int result=Character.codePointCount(seq, set, count);
		
		System.out.println("The codepoint count is " + result);

	}

}
