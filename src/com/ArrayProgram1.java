package com;

import java.util.Arrays;

//1. Write a Java program to sort a numeric array and a string array.

public class ArrayProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {33,55,66,22,6,99,76,1};
		
		System.out.println("This the given number " + Arrays.toString(array));
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] > array[j])
				{
				int temp= array[i];
				array[i]=array[j];
				array[j]=temp;
				
			}
			}
		}
		System.out.println("This is a sorted number " + Arrays.toString(array)); 
		

	}

	}

