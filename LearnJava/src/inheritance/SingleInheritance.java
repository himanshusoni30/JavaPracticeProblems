package inheritance;


//Implicitly every class in Java inherits java.lang.Object
public class SingleInheritance {

	void m1()
	{
		System.out.println("Inside m1");
	}
	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		obj.m1();
		obj.hashCode();
		obj.getClass();
	}

}
