/**
 * Write a java program to check if two Strings are anagram in java?
 * Approach 1
 */

package stringproblems;

public class AreStringsAnagramAproach1 {
	static String s1 = "wrong";
	static String s2 = "grown";

	public static boolean anagram() {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			int i = 0;
			while (i < s1.length()) {
				char c = s1.charAt(i);
				int index = s2.indexOf(c);

				if (index != -1) {
					s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
					System.out.println(s2);
				} else {
					return false;
				}
				i++;
			}
			return s2.isEmpty();
		}
	}

	public static void main(String[] args) {
		System.out.println("Are strings " + s1 + " and " + s2 + " anagrams? " + AreStringsAnagramAproach1.anagram());
	}
}
