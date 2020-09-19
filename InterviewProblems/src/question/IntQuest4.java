/*
 * write a program to print pyramid based on given input number. (for eg: n=3)
 * 			*			
 * 		*	*	*
 * 	*	*	*	*	*
 *  * 
 */

package question;

import java.util.Scanner;

public class IntQuest4 {

	public static void prettyPrint(int n) {
		int i = n - 1;

		while (i >= 0) {
			int j = 0;
			while (j < 2 * n) {
				/**
				 * when j is equal or greater than i then j should iterate till twice of a given
				 * number but should not print if greater than or equal to twice of n
				 */
				if (j >= i && (i + j + 1) < 2 * n) {
					System.out.print("*");
				}
				/**
				 * when j is less than i, j should iterate less than the given
				 * number and should print blank if j is less than n
				 * 
				 * else if (j < i && j < n) 
				 */
				else {
					System.out.print(" ");
				}
				j++;
			}
			i--;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		int n = scan.nextInt();
		IntQuest4.prettyPrint(n);
	}

}
