package maths;

import java.util.Scanner;

public class FizzBuzz {

	public static String[] fizzBuzz(int A) {
		String arr[] = new String[A];
		int count=1;
		for(int i=0;i<arr.length;i++) {
			if(count%3==0 & count%5==0) {
				arr[i]="FizzBuzz";
			}
			else if(count%3==0) {
				arr[i]="Fizz";
			}
			else if(count%5==0) {
				arr[i]="Buzz";
			}
			else {
				Integer j = new Integer(count);
				String s = j.toString();
				arr[i] = s;
			}
			count+=1;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		String[] arr = FizzBuzz.fizzBuzz(num);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
