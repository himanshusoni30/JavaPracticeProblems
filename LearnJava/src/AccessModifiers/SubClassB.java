package AccessModifiers;

public class SubClassB extends SuperClass
{
	public static void main(String[] args)
	{
		SuperClass obj=new SuperClass();
		SubClassA obj1=new SubClassA();
		SubClassB obj2=new SubClassB();
		obj1.testIt();
//		obj2.methodB();
		obj.x=10;
		System.out.println(obj.x);
	}
}