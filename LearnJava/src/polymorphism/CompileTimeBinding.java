package polymorphism;

public class CompileTimeBinding {

	void add(int a,int b)
	{
		System.out.println("Result is: "+(a+b));
	}
	
	void add(float a,float b)
	{
		System.out.println("Sum of floats is: "+(a+b));
	}
	
	void add(int a,int b, int c)
	{
		System.out.println("Sum of integers is: "+(a+b+c));
	}
	
	public static void main(String[] args) {
		CompileTimeBinding ctb = new CompileTimeBinding();
		ctb.add(4, 6);
		ctb.add(6f, 7f);
		ctb.add(4, 20, 6);
	}
}
