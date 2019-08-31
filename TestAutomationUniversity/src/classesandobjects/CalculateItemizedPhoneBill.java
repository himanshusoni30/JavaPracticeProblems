package classesandobjects;

import java.util.Scanner;

public class CalculateItemizedPhoneBill {
	private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		CalculateItemizedPhoneBill bill = new CalculateItemizedPhoneBill();
				
		System.out.println("Enter the id of customer: ");
		PhoneBill billId = new PhoneBill(bill.scan.nextInt());
		int id = billId.getId();
		
		PhoneBill otherItems = new PhoneBill();
		
		System.out.println("Enter base cost of the plan in $: ");
		otherItems.setBaseCost(bill.scan.nextDouble());
		double basePlan = otherItems.getBaseCost();
		
		System.out.println("Enter number of allotted minutes : ");
		otherItems.setAllottedMins(bill.scan.nextInt());
		int allottedMins = otherItems.getAllottedMins();
		
		System.out.println("Enter number of used minutes : ");
		otherItems.setMinsUsed(bill.scan.nextInt());
		int usedMins = otherItems.getMinsUsed();
		
		bill.calculateAndPrint(id, basePlan, allottedMins, usedMins);
		
		bill.scan.close();
	}
	
	public double calculateOverage(int allottedMins, int usedMins) {
		double balanceMinsRate;
		if(usedMins > allottedMins) {
			balanceMinsRate=(usedMins-allottedMins) * 0.25;
		}
		else {
			balanceMinsRate=0;
		}
		return balanceMinsRate;
	}
	
	public double calculateTax(int allottedMins, int usedMins, double baseCost) {
		double tax = (baseCost + allottedMins + calculateOverage(allottedMins,usedMins))*0.15;
		return tax;
	}
	
	public void calculateAndPrint(int id, double baseCost, int allottedMins, int usedMins) {
		double subTotal = calculateOverage(allottedMins, usedMins) + calculateTax(allottedMins, usedMins, baseCost)
				+ baseCost;
		System.out.println("Bill Id of customer: " + id);
		System.out.println("OverAge cost: $ " + String.format("%.2f", calculateOverage(allottedMins, usedMins)));
		System.out.println("Tax cost: $ " + String.format("%.2f", calculateTax(allottedMins, usedMins, baseCost)));
		System.out.println("Total bill: $ " + String.format("%.2f", subTotal));
	}

}
