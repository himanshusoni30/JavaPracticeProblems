/**
 * Write a program to find the factorial of a given number.
 * BackTracking using Recursion
 */
package question;

import java.util.Scanner;

public class FactorialRecursion {
	static int p = 1;

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		p *= n;
//		System.out.println(p);
		factorial(n - 1);
		return p;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		int n = scan.nextInt();
		System.out.println("Factorial of a given number "+n+" is: " + FactorialRecursion.factorial(n));
	}

}
