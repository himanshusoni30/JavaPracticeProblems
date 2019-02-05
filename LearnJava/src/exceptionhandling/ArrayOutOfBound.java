package exceptionhandling;

public class ArrayOutOfBound {
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		System.out.println("Elements of an array are:");
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index beyond array length.");
		}
	}
	
	void method1()
	{
		System.out.println("method1");
	}
}
