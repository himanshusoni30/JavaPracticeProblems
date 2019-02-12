package localinnerclass;

public class Outer {

	void f1() {
		System.out.println("Inside Outers f1()");
		class Inner {
			void f2() {
				System.out.println("Inside Inners f2()");
			}
		}
		Inner inner = new Inner();
		inner.f2();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.f1();
	}
}
