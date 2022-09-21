package com;

public class LittleChild extends ChildClass
{
	
	public void littleChilemethod()
	{
		System.out.println("This is little child method");
	}
	
	public void placeOrder()
	{
		System.out.println("successful place the order");
	}
	
	public static void main(String[] args) {
		
         System.out.println("This is single inheritence"); 
		 ChildClass c= new ChildClass();
		 c.loginPage();
		 c.homePage();
		 c.searchProduct();
		 c.buyproduct();
		 c.addtoCart();
		
		System.out.println("******************************");
	    System.out.println("This is mutilevel inheritence");
		
		LittleChild lt = new LittleChild();
		lt.loginPage();
		lt.homePage();
		lt.searchProduct();
		lt.addtoCart();
		lt.buyproduct();
		lt.littleChilemethod();
		lt.placeOrder();
	}

}
