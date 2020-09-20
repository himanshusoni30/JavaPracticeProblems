package stringproblems;

public class FindDuplicateCharsInString {
	static String s = "I have duplicate characters.";
	static StringBuffer sb = new StringBuffer();
	static StringBuffer sb2 = new StringBuffer();

	public static void m1() {
		int i = 0;
		while (i < s.length()) {
			char ch = s.charAt(i);
			m2(ch);
			i++;
		}
		System.out.println("Duplicate characters: " + sb2);
		System.out.println("Unique characters: " + sb);
	}

	public static void m2(char ch) {
		int j = 0;
		boolean flag = false;
		while (j < sb.length()) {
			if (sb.charAt(j) == ch) {
				flag = true;
				break;
			}
			j++;
		}
		if (flag) {
			sb2.append(ch);
		} else {
			sb.append(ch);
		}
	}

	public static void main(String[] args) {
		FindDuplicateCharsInString.m1();
	}
}