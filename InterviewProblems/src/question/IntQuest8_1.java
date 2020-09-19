/**
 * Write a program to check the quantity at nth day.
 * Each day quantity gets doubled as compared to previous day.
 * 
 * For eg: day 1: 1, day 2: 2, day 3: 4, day 4: 8.......
 * 
 * BackTracking using Recursion
 * 
 * Another way to solve the IntQuest8 problem.
 */
package question;

import java.util.Scanner;

public class IntQuest8_1 {
	static int a = 1;

	public static int calculateQuant(int n) {
		if (n == 1) {
			return 0;
		}
//		c = 2*a;
//		a = c;
//		c = a/2;
		a = 2 * a;
		calculateQuant(n - 1);
		return a;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		int n = scan.nextInt();
		System.out.println("Quantity of a product at "+n+"st/nd/th day is: " + IntQuest8_1.calculateQuant(n));
	}

}
