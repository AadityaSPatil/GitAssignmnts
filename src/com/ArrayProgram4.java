package com;

import java.util.Arrays;

public class ArrayProgram4 {
	
	//4.Write a Java program to calculate the average value of array elements

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {2,56,73,-12,12,99,100,50};
		
		System.out.println("The given number is = " + Arrays.toString(array));
		
		int average= array[0];
		
		for(int i=1; i<array.length;i++)
		{
			if(average<array[i]);
			{
				average=array[i];
			}
		}
		
		     System.out.println("The average number is " + average);
		

	}

}
