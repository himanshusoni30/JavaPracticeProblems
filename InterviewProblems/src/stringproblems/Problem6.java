package stringproblems;

public class Problem6 {
	public static String compareChars(String s1, String s2) {
		String result = "";

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				break;
			} else {
				result = result + s1.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] s = { "aaah", "aaahh", "aaahhh", "aaaaah" };
		String res = compareChars(s[0], s[1]);
		for (int i = 2; i < s.length; i++) {
			res = compareChars(res, s[i]);
		}
		System.out.println(res);
	}
}
