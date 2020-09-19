/**
 * Write a java program to check if two Strings are anagram in java?
 * Approach 2
 */

package stringproblems;

public class AreStringsAnagramApproach2 {
	static String s1 = "angel";
	static String s2 = "glean";

	public static boolean anagram() {
		if (s1.length() != s2.length()) {
			return false;
		}
		int count[] = new int[256];
		int i = 0;
		while (i < s1.length()) {
			System.out.println(s1.charAt(i)+", "+(int)s1.charAt(i));
			System.out.println(s2.charAt(i)+", "+(int)s2.charAt(i));
			
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
			i++;
		}

		for (int j = 0; j < count.length; j++) {
			if (count[j] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Are strings " + s1 + " and " + s2 + " anagrams? " + AreStringsAnagramApproach2.anagram());
	}
}
