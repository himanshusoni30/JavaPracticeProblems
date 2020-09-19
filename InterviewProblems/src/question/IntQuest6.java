/**
 * Write a program to print fibonacci series till nth number.
 */

package question;

import java.util.Scanner;

public class IntQuest6 {

	public static void fibonacci(int n) {
		int i = 0, 
//				a = 0, 
				a = -1,
				b = 1, 
				sum = 0;

//		System.out.print(a + " ");
		while (i < n) {
			sum = a + b;
			a = b;
			b = sum;
//			System.out.print(a + " ");
			System.out.print(sum + " ");
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		int n = scan.nextInt();
		IntQuest6.fibonacci(n);
	}

}
