package com;

import java.util.Arrays;

//2. Write a Java program to sum values of an array.

public class ArrayProgram2 {
	
	public static void main(String[] args) {

		
		String array[] = {"Patil", "Aaditya", "Sudhakar"};
		System.out.println("This is given array " + Arrays.toString(array)); 

		for(int i=0; i<(array.length/2); i++)
		{
		
			String s= array[(array.length-1)-i];  
			array [(array.length-1)-i] = array[i];
			array[i] =s;    

		}

		System.out.println("This is sort string " + Arrays.toString(array)); 
	}



}

