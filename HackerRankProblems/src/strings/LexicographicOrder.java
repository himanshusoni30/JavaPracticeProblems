/**
 * Given two strings of lowercase English letters, A and B, perform the following operations:

   	1. Sum the lengths of A and B.
   	2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
	3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
 */

package strings;

import java.util.Scanner;

public class LexicographicOrder {
	public int combinedLength(String s1, String s2) {
		return s1.length() + s2.length();
	}

	public String lexicographicallyComparison(String s1, String s2) {
		if(s1.compareTo(s2) <= 0) {
			return "No";
		}else {
			return "Yes";
		}
	}

	public String camelCase(String s) {
		char ch = s.charAt(0);
		Character upperCase = Character.toUpperCase(ch);
		return upperCase.toString() + s.substring(1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		LexicographicOrder obj = new LexicographicOrder();
		System.out.println(obj.combinedLength(A, B));

		System.out.println(obj.lexicographicallyComparison(A, B));
		System.out.println(A.compareTo(B));

		System.out.println(obj.camelCase(A) + " " + obj.camelCase(B));
	}

}
