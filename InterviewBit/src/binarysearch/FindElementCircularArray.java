package binarysearch;

import java.util.Scanner;

public class FindElementCircularArray {

	public static int findElement(int a[], int x) {
		int low = 0, high = a.length - 1;

		while (low <= high) {
			int mid = low + (high - low)/2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] <= a[high]) {
				if (x > a[mid] && x <= a[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else if (a[low] <= a[mid]) {
				if (x >= a[low] && x < a[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {21, 25, 27, 29,30,34, 12, 15, 17,18}; //array should be circularly sorted or sorted
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find in array [21, 25, 27, 29,30,34, 12, 15, 17,18]");
		int x = scan.nextInt();
		System.out.println("Element to be searched is "+x);
		int index = FindElementCircularArray.findElement(arr, x);
		System.out.println("Element "+x+" is present at index "+index);
	}

}
