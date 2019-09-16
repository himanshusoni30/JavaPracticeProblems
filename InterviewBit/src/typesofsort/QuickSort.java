package typesofsort;

public class QuickSort {
	
	public static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end]; //element at end index i.e. pivot
		int pIndex = start; //starting index of array
		
		for(int i=start;i<end;i++) {
			if(arr[i] <= pivot) {
				swap(arr, i, pIndex);
				pIndex=pIndex+1;
			}			
		}
		
		swap(arr, pIndex, end);
		return pIndex;
	}
	
	public static void swap(int[] arr, int i, int pIndex) {
		//below commented code will work if two arrays are passed, otherwise all the elements will be zero.
//		arr[i] = arr[i]+arr[pIndex];
//		arr[pIndex] = arr[i]-arr[pIndex];
//		arr[i] = arr[i]-arr[pIndex];
		int temp = arr[i]; 
		arr[i] = arr[pIndex]; 
		arr[pIndex] = temp; 
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		if(start < end) {
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex-1);
			quickSort(arr, pIndex+1, end);
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + "|");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 17, 25, 31, 13, 2, 32, 65, 100, 2000 };
		System.out.println("Array before sorting:");
		printArray(arr);
		quickSort(arr,0,arr.length-1);
		System.out.println("\n\nArray after sorting in ascending order: ");
		printArray(arr);
	}

}
