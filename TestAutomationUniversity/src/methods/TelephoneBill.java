package methods;

import java.util.Scanner;

public class TelephoneBill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base cost of the plan in $: ");
		double basePlan = scan.nextDouble();
		
		System.out.println("Enter overage minutes: ");
		int overAgeMinutes = scan.nextInt();
		
		calculateAndPrint(basePlan,overAgeMinutes);
	}
	
	public static float calculateOverage(int overAgeMinutes) {
		return overAgeMinutes*0.25f;
	}
	
	public static double calculateTax(double planRate, int overAgeMinutes) {
		double tax = (planRate + calculateOverage(overAgeMinutes))*15/100;
		return tax;
	}
	
	public static void calculateAndPrint(double planRate, int overAgeMinutes) {
		double subTotal = calculateOverage(overAgeMinutes) + calculateTax(planRate, overAgeMinutes) + planRate;
		System.out.println("Phone bill statement.");
		System.out.println("Plan: $"+ String.format("%.2f", planRate));
		System.out.println("Overage: $"+ String.format("%.2f", calculateOverage(overAgeMinutes)));
		System.out.println("Tax: $"+ String.format("%.2f", calculateTax(planRate,overAgeMinutes)));
		System.out.println("Total: $"+ String.format("%.2f",subTotal));	
	}

}
