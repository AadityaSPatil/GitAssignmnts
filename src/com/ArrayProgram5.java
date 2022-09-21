package com;

import java.util.Arrays;

public class ArrayProgram5 {
	
	//5. Write a Java program to test if an array contains a specific value.

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		int array[]= {2,56,12,33,99,55,12,2,100};
		
		System.out.println("The given value is " + Arrays.toString(array));
		{
			for(int i=0; i<array.length; i++)
			{
				for(int j=i+1; j<array.length; j++)
				{
					if(array[i]==array[j])
					{
						System.out.println("The specific value sort= " + array[i]);
					}
				}
			}
		}
		
		

	}

}
