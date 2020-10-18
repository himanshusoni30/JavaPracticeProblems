package ds.arrays;

public class BubbleSort {
	static BubbleSort obj;

	public void swapArray(int array[], int i, int j) {
		if (i == j) {
			return;
		} else {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	public int[] ascendingOrder(int[] intArray) {
		int lastIndex = intArray.length - 1;
		for (int m = lastIndex; m > 0; m--) {
			for (int n = 0; n < m; n++) {
				if (intArray[n] > intArray[n + 1]) {
					obj.swapArray(intArray, n, n + 1);
				}
			}
		}
		return intArray;
	}

	public int[] descendingOrder(int[] intArray) {
		int lastIndex = intArray.length - 1;
		for (int m = lastIndex; m > 0; m--) {
			for (int n = 0; n < m; n++) {
				if (intArray[n] < intArray[n + 1]) {
					obj.swapArray(intArray, n, n + 1);
				}
			}
		}
		return intArray;
	}

	public void displayArrayElements(int[] intArray) {
		for (int k = 0; k < intArray.length; k++) {
			System.out.println("Index: " + k + ", ElementAfterSort: " + intArray[k]);
		}
	}

	public static void main(String[] arg) {
		obj = new BubbleSort();
		int[] intArray;
		intArray = new int[] { 20, 35, -15, 7, 55, 1, -22 };

		System.out.println("Array sorted in ascending order: ");
		obj.displayArrayElements(obj.ascendingOrder(intArray));

		System.out.println("Array sorted in descending order: ");
		obj.displayArrayElements(obj.descendingOrder(intArray));
	}
}
