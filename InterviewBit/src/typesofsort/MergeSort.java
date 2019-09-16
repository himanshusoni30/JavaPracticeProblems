package typesofsort;

public class MergeSort {
	public int[] mergeSortedArrays(int[] left, int[] right, int[] arr) {
		int nl = left.length;
		int rl = right.length;
		int i = 0, j = 0, k = 0;

		while (i < nl && j < rl) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < nl) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < rl) {
			arr[k] = right[j];
			j++;
			k++;
		}
		return arr;
	}

	public int[] splitArray(int[] arr) {
		int l = arr.length;
		int mid = l / 2;

		int[] left = new int[mid];
		int[] right = new int[l - mid];

		if (l < 2) {
			return null;
		} else {
			for (int i = 0; i < mid; i++) {
				left[i] = arr[i];
			}
			for (int j = 0; j < l-mid; j++) {
				right[j] = arr[mid+j];
			}
		}
		splitArray(left);
		splitArray(right);
		return mergeSortedArrays(left, right, arr);
	}
	
	public void printSortedArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + "|");
		}
	}
	
	public static void main(String[] args) {
//		int[] arr = { 17, 25, 31, 13, 2, 32, 65, 100, 2000, 20, 23, 50};
		int[] arr = { 17, 25, 31, 13, 2};
		MergeSort obj = new MergeSort();
		System.out.println("Array before sorting:");
		obj.printSortedArray(arr);
		obj.splitArray(arr);
		System.out.println("\n\nArray after sorting in ascending order: ");
		obj.printSortedArray(arr);
	}
}
