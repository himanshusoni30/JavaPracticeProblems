package operators;

import java.util.Scanner;

public class ChangeToDollars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How many pennies?");
		int pennies = scan.nextInt();

		System.out.println("How many nickels?");
		int nickels = scan.nextInt();

		System.out.println("How many dimes?");
		int dimes = scan.nextInt();

		System.out.println("How many quarters?");
		int quarters = scan.nextInt();

		int pennyToCents = pennies * 10;
		int nickelToCents = nickels * 20;
		int dimesToCents = dimes * 1;
		int quartersToCents = quarters * 25;
		int remaining = 0;

		int countCents = pennyToCents + nickelToCents + dimesToCents + quartersToCents;

		if (countCents == 100) {
			System.out.println("You won the game.");
		} else if (countCents > 100) {
			remaining = countCents - 100;
			System.out.println("You went over by: " + remaining + " dimes");
		} else {
			remaining = 100 - countCents;
			System.out.println("You went under by: " + remaining + " dimes");
		}
	}
}
