package arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int arr2[] = new int[5];

		arr2[0] = 1;
		arr2[1] = new Integer(10);
		arr2[2] = (int) 3.14;
		arr2[3] = 0;

		for (int i = 0; i < arr2.length; i++) {
//			System.out.print("Elements of Array arr and arr2: ");
			System.out.println("arr[" + i + "]: " + arr[i] + "	|	" + "arr2[" + i + "]: " + arr2[i]);
		}
		System.out.println("Using For Each Loop.");
		System.out.println("Elements of Array arr.");
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("Elements of Array arr2.");
		for (int i : arr2) {
			System.out.println(i);
		}
		
		int intArr[]=arr.clone();
		System.out.println("Operations on intArr");
		System.out.println("Class name: "+intArr.getClass());
		System.out.println("Get the hash code of array: "+intArr.hashCode());
		System.out.println("Length of an array: "+intArr.length);
	}
}
