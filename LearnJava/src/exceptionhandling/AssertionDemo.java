package exceptionhandling;

public class AssertionDemo {

	public static void main(String[] args) {
		int withdrawalAmount=100;
		int currentBalance=60;
		
		assert (withdrawalAmount < currentBalance):"Withdrawal amount is greater than current balance";
	}
}
