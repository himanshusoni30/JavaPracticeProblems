/**
 * Find all substrings of a String in java.
 */
package stringproblems;

import java.util.Scanner;

public class FindAllSubStringsInString {
	public static void allSubStrings(String s) {
		int i = 0;
		while (i < s.length()) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String s = scan.nextLine();
		FindAllSubStringsInString.allSubStrings(s);
	}
}
