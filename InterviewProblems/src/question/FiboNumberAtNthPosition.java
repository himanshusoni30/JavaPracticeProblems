/**
 * Write a program to print the nth number in fibonacci series.
 * 
 * Backtracking using recursion
 */

package question;

import java.util.Scanner;

public class FiboNumberAtNthPosition {
	static int a = -1, b = 1, c = 0;

	public static int fibo(int n) {
		if (n <= 0) {
			return 0;
		}
		c = a + b;
		a = b;
		b = c;
		fibo(n - 1);
		return c;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		int n = scan.nextInt();
		System.out.println("Number in fibonacci series at nth position is: " + FiboNumberAtNthPosition.fibo(n));
	}
}
