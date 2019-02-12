package nonstaticinnerclass;

public class AccessOuterClassMembersInsideInnerClass {
	private static int x = 30;
	private int y;
	
	public AccessOuterClassMembersInsideInnerClass(int y) {
		this.y=y;
	}
	
	void f1()
	{
		System.out.println("Outer class non static method");
	}
	
	class Inner{
		private int y;
		
		Inner(int y){
			this.y=y;
		}
		
		private void f2() {
			System.out.println("Outer class X: "+AccessOuterClassMembersInsideInnerClass.x);
			System.out.println("Outer class Y: "+AccessOuterClassMembersInsideInnerClass.this.y);
			System.out.println("Inner class Y: "+this.y);
		}
	}
	
	public static void main(String[] args) {
		AccessOuterClassMembersInsideInnerClass outer = new AccessOuterClassMembersInsideInnerClass(80);
		outer.f1();
		
		AccessOuterClassMembersInsideInnerClass.Inner inner = outer.new Inner(50);
		inner.f2();
		System.out.println(inner.y);
	}
}
