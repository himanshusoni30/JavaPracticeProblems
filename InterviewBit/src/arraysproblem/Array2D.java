package arraysproblem;

import java.util.ArrayList;

public class Array2D {

	static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
	}
	
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		int k=1;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);a1.add(2);a1.add(3);a1.add(4);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(5);a2.add(6);a2.add(7);a2.add(8);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(9);a3.add(10);a3.add(11);a3.add(12);
		A.add(a1);
		A.add(a2);
		A.add(a3);
		ArrayList<ArrayList<Integer>> B = performOps(A);
		for (int i = 0; i < B.size(); i++) {
		    for (int j = 0; j < B.get(i).size(); j++) {
		            System.out.print(B.get(i).get(j) + " ");
		    }
		}
	}
	
}
