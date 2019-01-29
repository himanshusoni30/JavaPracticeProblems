package finalconcepts;

public final class Alpha {
	final float pi = 3.14f;
	final float fy;
	final static float si = 2.14f; //this can be used anywhere in class without using object. Refer Main method.
	
	Alpha()
	{
		fy = 5f; // Since fy value was not assigned above it can be assigned only using constructors. 
		//It cannot be assigned outside constructor.
	}
	
	public static void main(String[] args) {
		Alpha a = new Alpha();
		//a.pi=10; //Since pi is marked as final it's value cannot be changed anywhere else.
		
		final Alpha b = new Alpha();
		//b = new Alpha();//object b cannot be instantiated again if object is declared as final.
		
		System.out.println(Alpha.si);
	}
}
