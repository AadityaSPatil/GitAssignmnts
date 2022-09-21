package abstraction;

public class AbstractChildClass extends AbstractClass {

	@Override
	public void m1() {
		
		System.out.println("This is a m1 method");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
		System.out.println("This is a m2 method");
		
	}
	
	public static void main(String[] args) {
		
		AbstractChildClass c= new AbstractChildClass();
		
		AbstractClass c2= new AbstractChildClass();
		
		c.m1();
		c.m2();
		AbstractClass.m3();
		c.m4();
		
		c2.m1();
		c2.m2();
		AbstractClass.m3();
		c2.m4();
		
	}
	
	
	
	
	
	

}
