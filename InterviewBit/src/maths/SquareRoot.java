package maths;

import java.util.Scanner;

public class SquareRoot {
	public static int sqrt(int a) {
        Double d = Math.pow(a,0.5);
        Integer i = d.intValue();
        return i;
    }
		
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number greater than 1.");
		int x = scan.nextInt();
		System.out.println("Square Root of number "+x+" is "+SquareRoot.sqrt(x));
	}
}
