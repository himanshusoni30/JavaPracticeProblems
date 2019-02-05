package exceptionhandling;

public class StringParser {
	public static void main(String[] args) {
		String s = "abcde";
		try {
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("String does not contain integers, hence cannot be converted into integer");
		}
		System.out.println(s);
	}
}
