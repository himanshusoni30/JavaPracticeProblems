package com.learn.hackerrankproblems;
import java.util.*;

public class Operators
{
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip=meal_cost*((double)tip_percent/100);
        System.out.println("Tip:"+tip);
        double tax=meal_cost*((double)tax_percent/100);
        System.out.println("Tax:"+tax);
        double totalCost= (tip+tax+meal_cost);
        int totalRoundCost = (int)Math.round(totalCost);
        System.out.println("The total meal cost is " + totalRoundCost+" dollars.");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
