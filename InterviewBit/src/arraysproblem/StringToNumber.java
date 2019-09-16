package arraysproblem;

public class StringToNumber {
	public static int titleToNumber(String A) {
		int length=A.length();
		int raiseToPower = length-1;
		int sum=0;
		for(int i=0;i<A.length();i++) {
			sum += Math.pow(26,(raiseToPower))*(A.codePointAt(i)-64);
			raiseToPower--;
		}
		return sum;
    }
	
	public static void main(String[] args) {
		System.out.println(StringToNumber.titleToNumber("TEST"));
	}
}
