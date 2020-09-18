/**
 * Write a program to print unique chars in string of repetitive characters.
 */

package question;

public class IntQuest2 {
	static String s = new String("Thequickbrownfoxjumpsoveralazydog");
	static StringBuffer sb = new StringBuffer();

	public static void m1() {
		int i = 0;
		while (i < s.length()) {
			char ch = s.charAt(i);
			m2(ch);
			i++;
		}
		System.out.println("Unique characters in a string: " + sb);
	}

	public static void m2(char ch) {
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
		}
	}

	public static void main(String[] args) {
		IntQuest2.m1();
	}
}
