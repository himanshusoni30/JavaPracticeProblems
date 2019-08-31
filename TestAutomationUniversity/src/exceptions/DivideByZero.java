package exceptions;

public class DivideByZero {
	public static void main(String args[]) {
		try {
			int divide = 30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Division by 0 is not permitted");
		}
		finally{
			System.out.println("Division is fun.");
		}
	}
}
