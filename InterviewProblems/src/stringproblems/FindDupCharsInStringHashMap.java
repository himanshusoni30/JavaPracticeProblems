package stringproblems;

import java.util.HashMap;
import java.util.Scanner;

public class FindDupCharsInStringHashMap {
	static HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

	public static void findDupChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (charMap.containsKey(s.charAt(i))) {
				charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
			} else {
				charMap.put(s.charAt(i), 1);
			}
		}

		for (Character c : charMap.keySet()) {
			if (charMap.get(c) > 1) {
				System.out.println("Character '" + c + "' occurs more than once ====> " + charMap.get(c));
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the alphabetical string: ");
		String s = scan.nextLine();
		FindDupCharsInStringHashMap.findDupChars(s);
	}
}
