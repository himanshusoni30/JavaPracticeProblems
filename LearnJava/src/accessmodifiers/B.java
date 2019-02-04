package accessmodifiers;

public class B {
//classes within the same package can access the members which are not private, a is defined as private
//	integer in class A.
	public static void main(String[] args) {
		A obj = new A();
//		System.out.println(obj.a);
		System.out.println("b: "+obj.b);
		System.out.println("c: "+obj.c);
		System.out.println("d: "+obj.d);
	}

}
