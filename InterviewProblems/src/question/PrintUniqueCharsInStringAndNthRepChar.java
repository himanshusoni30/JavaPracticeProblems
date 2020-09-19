/**
 * Write a program to print unique chars in string of repetitive characters. 
 * Also, print the nth repeated character in string.
 * for eg: "TrainPlaneTrain" ===> 1st repetitive char is a, 2nd repetitive char
 * is n, 3rd repetitive char is T, and so on.....
 */

package question;

public class PrintUniqueCharsInStringAndNthRepChar {
	static String s = new String("Thequickerbrownfoxjumpsoveralazydog");
	static StringBuffer sb = new StringBuffer();

	public static void m1(int n) {
		int i = 0, j = 0;
		while (i < s.length()) {
			char ch = s.charAt(i);
			boolean b = m2(ch);
			if (b) { // if b is true or b==true or ch is repetitive in a given string
				j++;
				if (j == n) {
					System.out.println(n + "th repetitive character in string is " + ch + " at index " + i);
				}
			}
			i++;
		}
		System.out.println("Unique characters in a string: " + sb);
	}

	public static boolean m2(char ch) {
		int i = 0;
		boolean flag = false;
		while (i < sb.length()) {
			char ch1 = sb.charAt(i);
			if (ch == ch1) {
				flag = true;
				break;
			}
			i++;
		}
		if (flag == false) {
			sb.append(ch);
			return flag; // return false because given ch is unique and non repetitive.
		} else {
			return flag;// return true because given ch is not unique and repetitive
		}
	}

	public static void main(String[] args) {
		PrintUniqueCharsInStringAndNthRepChar.m1(3);
	}
}
