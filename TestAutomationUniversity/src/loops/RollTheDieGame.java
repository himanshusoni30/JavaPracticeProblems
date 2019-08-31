package loops;

import java.util.Random;

public class RollTheDieGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int rolls = 0;
		int count = 0;

		while (rolls < 5) {
			int die = rand.nextInt(6) + 1;
			count = count + die;
			int remaining = 20 - count;
			System.out.println("You've rolled a " + die + ". You are now on space " + count + " and have " + remaining
					+ " more to go.");
			rolls++;
		}
		if (count == 20) {
			System.out.println("You have won the game.");
		} else {
			System.out.println("You lost the game.");
		}
	}
}
