package other;

import org.junit.Test;

import accessmodifiers.SubClassA;
import accessmodifiers.SubClassB;
import accessmodifiers.SuperClass;

public class Child extends SuperClass{
	@Test
	public void test()
	{
		SuperClass obj=new SuperClass();
		SubClassA obj1=new SubClassA();
		SubClassB obj2=new SubClassB();
		obj1.testIt();
//		obj2.methodB();
		
		System.out.println(x);
//		System.out.println(obj.x);
	}

}
