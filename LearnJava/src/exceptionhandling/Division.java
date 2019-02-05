package exceptionhandling;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter two integers: ");
		
		try {
			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			b = obj.nextInt();
			c = a/b;
			System.out.println("Result: "+c);

		} catch (ArithmeticException e) {
			System.out.println("second integer should not be 0");
		}
		finally {
			System.out.println("This will be executed always.");
		}
		System.out.println("Code continues...");
	}
}
