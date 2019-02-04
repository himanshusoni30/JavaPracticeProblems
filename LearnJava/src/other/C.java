package other;

import accessmodifiers.A;

public class C extends A {
	
	public static void main(String[] args) {
		A obj = new  A();
		C objc = new C();
//		System.out.println("a: "+obj.a);//private member can be accessed only within it's class
//		System.out.println("b: "+obj.b);//default member can be accessed by classes within same package
		System.out.println("c: "+objc.c); //protected member is only accessible through object of derived class
		System.out.println("c: "+objc.d);//public member can be accessed through derived or parent class object
		System.out.println("d: "+obj.d);
	}

}
