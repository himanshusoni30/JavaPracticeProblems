package binarysearch;

import java.util.Scanner;

public class BinSearch {
	public static int binarySearch(int[] A,int x) {
		int start = 0;
		int end = A.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(x == A[mid]) return mid;
			else if(x < A[mid]) end = mid-1;
			else start = mid+1;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int arr[]= {2, 5, 6, 12, 15, 20, 25, 30};
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a number from array [2, 5, 6, 12, 15, 20, 25, 30]:");
		int x = scan.nextInt();
		int output = BinSearch.binarySearch(arr, x);
		if(output != -1) {
			System.out.println("Number "+x+" is present at index "+output);
		}
		else {
			System.out.println("Number "+x+" is not present in array.");
		}
	}
}
