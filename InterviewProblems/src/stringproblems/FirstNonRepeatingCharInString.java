/**
 * Find first non repeated character in a String
 */

package stringproblems;

import java.util.Scanner;

public class FirstNonRepeatingCharInString {

	public static char getFirstNonRepeatingChar(String s) {
		int i = 0;
		char ch = 0;
		char[] c = s.toCharArray();
		while (i < c.length) {
			if (s.indexOf(c[i]) == s.lastIndexOf(c[i])) {
				ch = c[i];
				break;
			}
			i++;
		}
		return ch;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String s = scan.nextLine();
		System.out.println("First non-repeating character in String (" + s + ") is " + getFirstNonRepeatingChar(s));
	}
}
