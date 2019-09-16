package arraysproblem;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBug {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[2];
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get(i));
        }
        return ret;
    }
	
	public static void main(String args[]) {
		
	}
}
