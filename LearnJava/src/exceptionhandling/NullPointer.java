package exceptionhandling;

public class NullPointer {
	static ArrayOutOfBound a;
	public static void main(String[] args) {
		try {
			NullPointer.a.method1();
		} catch (NullPointerException e) {
			System.out.println("variable a is not initialized.");
		}
	}
}
