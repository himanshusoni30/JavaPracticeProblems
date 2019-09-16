package binarysearch;

import java.util.Scanner;

public class SquareRootBinarySearch {
	public static int sqrt(int x) {
		int low=1,high=x/2;
		
		if(x<2) return x;
		int result=0;
		while(low<=high) {
			int mid = (low+high)/2;
			long sr = mid*mid;
			if(sr==x) {
				return mid;
			}
			else if(sr<x) {
				low=mid + 1;
				result=mid;
			}
			else if(sr>x) {
				high=mid-1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number greater than 1: ");
		int i = scan.nextInt();
		System.out.printf("sqrt(%d) = %d\n", i, sqrt(i));
	}
}
