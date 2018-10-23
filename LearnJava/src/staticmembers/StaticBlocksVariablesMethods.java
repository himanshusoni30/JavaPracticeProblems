package staticmembers;

public class StaticBlocksVariablesMethods 
{
	static int num=100; //static variable
	static int defaultValue; //static variable, value is not assigned, by default value of int is 0
	
	public static void main(String args[])
	{
		System.out.println("*****Inside Main method******");
		StaticBlocksVariablesMethods.staticMethod();
		System.out.println("Static Variable num: "+num);
		System.out.println("Static Varible's default value: "+defaultValue);
	}
	
	static {
		System.out.println("Inside static block 3");
	}
	
	static {
		System.out.println("Inside static block 1");
		StaticBlocksVariablesMethods.staticMethod();
	}
	
	static {
		System.out.println("Inside static block 2");
	}
	
	public static void staticMethod()
	{
		System.out.println("Inside static Method");
	}
}
