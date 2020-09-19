/**
 * Write a program to check the quantity at nth day.
 * Each day quantity gets doubled as compared to previous day.
 * 
 * For eg: day 1: 1, day 2: 2, day 3: 4, day 4: 8.......
 * 
 * BackTracking using Recursion
 */
package question;

import java.util.Scanner;

public class IntQuest8 {
	static int a = 1, c = 0;

	public static int calculateQuant(int n) {
		if (n <= 0) {
			return 0;
		}
		c = 2 * a;
		a = c;
		c = a / 2;
		calculateQuant(n - 1);
		return c;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		int n = scan.nextInt();
		System.out.println("Quantity of a product at "+n+"st/nd/th day is: " + IntQuest8.calculateQuant(n));
	}

}
