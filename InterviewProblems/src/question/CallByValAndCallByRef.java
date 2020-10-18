package question;

public class CallByValAndCallByRef {
	int x;
	int y;

	public static void main(String[] args) {
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int a = 10;
		int b = 11;

		System.out.println("Call by value, passing int variables: " + obj.sum(a, b));
		System.out.println("Call by value, passing values directly: " + obj.sum(1, 2));

		obj.x = 5;
		obj.y = 6;
		obj.swap(obj); // Call by reference, passing object reference:
		System.out.println("After Swap. Call by reference, passing object reference: " + obj.x);
		System.out.println("After Swap. Call by reference, passing object reference: " + obj.y);
	}

	public int sum(int i, int j) {
		return i + j;
	}

	public void swap(CallByValAndCallByRef r) {
		r.y = r.x + r.y;
		r.x = r.y - r.x;
		r.y = r.y - r.x;
	}
}
