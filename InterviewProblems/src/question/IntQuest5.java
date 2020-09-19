/**
 * Write a program to sum all the numbers present in a string separated by commas
 */

package question;

import java.util.Scanner;

public class IntQuest5 {

	public static int calculateSum(String s) {
		int i = 0, w = 0, sum = 0;
		int l = s.length();

		while (i < l) {
			if (s.charAt(i) == ',' || i == l - 1) {
				if (i == l - 1) {
					i++;
				}
				int k = Integer.parseInt(s.substring(w, i));
				sum += k;
				w = i + 1;
			}
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter comma separated numbers: ");
		String s = scan.nextLine();
		System.out.println("Sum of numbers present in " + s + " is: " + IntQuest5.calculateSum(s));
	}

}
