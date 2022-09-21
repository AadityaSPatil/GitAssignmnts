package com;

public class ClassOverriding2 extends ClassOverriding {
	
	//Example of method overriding

	public void firstName()
	{
		System.out.println("first name child class");
	}

	public void middleName()
	{
		System.out.println("middle name child class");

	}

	public void lastName()
	{
		System.out.println("last name child class");
	}

	public static void main(String[] args) {


	ClassOverriding2 c= new ClassOverriding2(); //call child class method
	c.firstName();
	c.middleName();
	c.lastName();

	ClassOverriding c2= new ClassOverriding2(); //call constructor child class by default call child class method
                //casting child to parent call chil class method 
	c2.firstName();
	c2.middleName();
	c2.lastName();
}



}
