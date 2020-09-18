package typesofsort;

public class InsertionSort {
	public int[] sortAscending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		return arr;
	}

	public int[] sortDescending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		return arr;
	}

	public void printSortedArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + "|");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 17, 25, 31, 13, 2, 32, 65, 100, 2000 };
		InsertionSort obj = new InsertionSort();
		System.out.println("Array before sorting:");
		obj.printSortedArray(arr);
		obj.sortAscending(arr);
		System.out.println("\n\nArray after sorting in ascending order: ");
		obj.printSortedArray(arr);
		obj.sortDescending(arr);
		System.out.println("\n\nArray after sorting in descending order: ");
		obj.printSortedArray(arr);
	}
}
