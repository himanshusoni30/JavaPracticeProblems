package binarysearch;

import java.util.Scanner;

public class BinSearchRecursion {
	public static int binarySearch(int[] A,int x, int start, int end) {
		if(start <= end) {
			int mid = start + (end-start)/2;
			if(x == A[mid]) return mid;
			else if(x < A[mid]) return binarySearch(A,x,start,mid-1);
			else return binarySearch(A,x,mid+1,end);
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int arr[]= {2, 5, 6, 12, 15, 20, 25, 30};
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a number from array [2, 5, 6, 12, 15, 20, 25, 30]:");
		int x = scan.nextInt();
		int output = BinSearchRecursion.binarySearch(arr, x, 0, 9);
		if(output != -1) {
			System.out.println("Number "+x+" is present at index "+output);
		}
		else {
			System.out.println("Number "+x+" is not present in array.");
		}
	}
}
