package com;

public class ClassOverloading {
	
	public ClassOverloading()
	{
	    System.out.println("*******Student Result*********");
	}
	
	public void method(int a)
	{
		System.out.println("Marks of First Subject is " + a);	
	}
	
	public void method(int a, int b)
	{
		System.out.println("Marks of two subject is " + a +" & " + b );
	}
	
	public void method(int a, int b, double c)
	{
		System.out.println("marks of three subject " + a +" & " + b +"  & " + c );
	}
	
	public void method(String s, char c)
	{
		System.out.println("My name is " + s + " Grade is " + c);
	}
	
	public static void main(String[] args) {
		
		ClassOverloading c = new ClassOverloading();
		c.method(50);
		c.method(50, 100);
		c.method(50, 100, 75.5);
		c.method("Aaditya",'A');
	}

}
