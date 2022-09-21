package abstraction;

public abstract class AbstractClass {
	
	public AbstractClass()
	{
		System.out.println("This is a constructor");
		
	}
	
	public abstract void m1();
	
	public abstract void m2();
	
	public static void m3()
	{
		System.out.println("This is a static method");
	}
	
	
	public void m4()
	{
		System.out.println("This is non static meyhod");
	}

}
