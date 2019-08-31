package arrays;

import java.util.Scanner;

public class GetDay {
	
	public static String day(int dayInNumber) {
		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		return days[dayInNumber];
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers between 1 to 7: ");
		int dayInNumbers = scan.nextInt()-1;
		if(dayInNumbers >= 0 && dayInNumbers <= 6) {
			System.out.println("Day name is :"+day(dayInNumbers));
		}
		else {
			System.out.println("Invalid Input. Numbers should be between 1 and 7");
		}
		scan.close();
	}
}
