package problem1;

public class TestRegex {
	public static void main(String[] args) {
		String text = "$188.04";
		String test = text.replaceAll("[$,]", "");
		System.out.println(test);
		
		
		String[] strArr = "212.215.115.165".split("\\.");
		int i = Integer.parseInt(strArr[0]);
		System.out.println(i);
	}
}
