package stringproblems;

public class RemoveJunkOrSpecialChars {
	public static void main(String[] args) {
		String s = "!@#$%^ Let us @#$#$#%$# test.";
		s = s.replaceAll("[^a-zA-Z0-9\\s]", "");//replace all except alphanumeric and space chars
		System.out.println(s);
		
		String s1 = "I )*#@)*#@)$*@!#)$*carry !@#!@#junk()_(_(+_) chars";
		s1 = s1.replaceAll("[^a-zA-Z0-9\\s]", "");//replace all except alphanumeric and space chars
		System.out.println(s1);
	}
}
