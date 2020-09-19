/**
 * Write a program to reverse a String.  
 */

package question;

public class RevStringTwice {
	static StringBuffer sb = new StringBuffer("position 1 no. @ is video This");

	public static void revString() {
		int i = 0;
		int j = 0;
		int w = 0;
		while (i < sb.length()) {
			if (i == 0) {
				w = 0;
			}
			if (sb.charAt(i) == ' ' || i == sb.length() - 1) {
				j = i;
				if (sb.charAt(i) == ' ') {
					j--;
				}
				swapChars(w, j);
				w = i + 1;
			}
			i++;
		}
		System.out.println("After reversing words: " + sb.toString());
		swapChars(0, sb.length() - 1);
		System.out.println("After reversing whole string: " + sb.toString());
	}

	public static void swapChars(int i, int j) {
		while (i < j) {
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, temp);
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		RevStringTwice.revString();
		long endTime = System.currentTimeMillis();
		System.out.println("Execution start time: " + startTime);
		System.out.println("Execution end time: " + endTime);
		System.out.println("Total time of execution: " + (endTime - startTime));
	}
}
