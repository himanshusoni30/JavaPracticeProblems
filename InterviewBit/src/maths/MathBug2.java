package maths;

import java.util.ArrayList;
import java.util.Scanner;

public class MathBug2 {
	public static ArrayList<ArrayList<Integer>> squareSum(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if(A<=1){
            return ans;
        }
        for (int a = 0; a * a < A; a++) {
            for (int b = 0; b * b < A; b++) {
                if (a * a + b * b == A) {
                    ArrayList<Integer> newEntry = new ArrayList<Integer>();
                    newEntry.add(a);
                    newEntry.add(b);
                    ans.add(newEntry);
                    break;
                }
            }
            if(ans.size()==1) {
            	break;
            }
        }
        return ans;
    }
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number.");
		int num = scan.nextInt();
		ArrayList<ArrayList<Integer>> ans = MathBug2.squareSum(num);
		for(ArrayList<Integer> i:ans) {
			for(int j:i) {
				System.out.print(j+" ");
			}
		}
	}
}
