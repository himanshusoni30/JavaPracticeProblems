/**
 * How to reverse a String in java? 
 * Can you write a program without using any java inbuilt methods?
 */

package stringproblems;

public class RevStrWithoutUtils {
	static StringBuffer s = new StringBuffer("This is a string.");
	
	public static void reverseStr() {
		int n = s.length();
		int i = 0;
		int j = n-1;
		System.out.println("String before reverse: "+s);
		while(i < n) {
			if(i < j) {
				char ch = s.charAt(i);
				s.setCharAt(i, s.charAt(j));
				s.setCharAt(j, ch);
			}
			i++;
			j--;
		}
		System.out.println("String after reverse: "+s);
	}
	
	public static void main(String[] args) {
		RevStrWithoutUtils.reverseStr();
	}
}
