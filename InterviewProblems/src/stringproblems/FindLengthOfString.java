/**
 * Find length of String without using any inbuilt method in java?
 */
package stringproblems;

import java.util.Scanner;

public class FindLengthOfString {
	
	public static void findLength(String s) {
		int i = 0;
		while(i < Integer.MAX_VALUE) {
			try{
				s.charAt(i);
			}catch(IndexOutOfBoundsException e) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String s = scan.nextLine();
		FindLengthOfString.findLength(s);
	}
}
