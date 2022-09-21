package com;

public class TestClass implements Interface1, Interface2 
{
	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("This is multiplication method");	
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("This is division method");	
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("This is addition method");	
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		System.out.println("This is subtraction method");		
	}

	public static void main(String[] args) {

		System.out.println("*************"+ s + "***********");
		TestClass t = new TestClass();
		t.addition();
		t.subtraction();
		t.division();
		t.multiplication();
	}

}
