/**
 * Write a program to check if String has all unique characters in java?
 * Approach 1
 */

package stringproblems;

public class AreUniqueCharInStringApproach1 {
	static String s1 = "angella";
	public static boolean isUniqueChars() {
		int i[] = new int[256];
		
		for(int j=0; j < s1.length(); j++) {
			i[s1.charAt(j)]++;
		}
		
		for(int k=0; k<i.length; k++) {
			if(i[k] > 1) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Does string "+s1+" contains unique characters? "+AreUniqueCharInStringApproach1.isUniqueChars());
	}
}
