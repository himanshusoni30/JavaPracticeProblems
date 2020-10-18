package question;

public class ReverseAnInteger {
	public static void main(String[] args) {
		int i = 1234567;
		int result = 0;
		int mod = 0;
		while(i > 0) {
			mod = i%10;
			result = result*10 + mod;
			System.out.println("result after each iteration: "+result);
			i /= 10;
		}
		System.out.println(result);
	}
}
