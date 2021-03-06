/**
 * Write a program to check if String has all unique characters in java?
 * Approach 2
 */

package stringproblems;

public class AreUniqueCharInStringApproach2 {
	public static boolean isUniqueChars(String s1) {
		int i = 0;
		while(i < s1.length()) {
			char ch = s1.charAt(i);
			if(s1.indexOf(ch) != s1.lastIndexOf(ch)) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Does string contains unique characters? "+AreUniqueCharInStringApproach2.isUniqueChars("angel"));
		System.out.println("Does string contains unique characters? "+AreUniqueCharInStringApproach2.isUniqueChars("nightangle"));
		System.out.println("Does string contains unique characters? "+AreUniqueCharInStringApproach2.isUniqueChars("funnel"));
		System.out.println("Does string contains unique characters? "+AreUniqueCharInStringApproach2.isUniqueChars("cruel"));
		System.out.println("Does string contains unique characters? "+AreUniqueCharInStringApproach2.isUniqueChars("occasion"));
	}
}
