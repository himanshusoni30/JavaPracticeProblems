package arraysproblem;

public class Steps {
	public int method(int[]A,int[]B) {
		int sizeOfA=A.length;
		int sizeOfB=B.length;
		int diffA=0,diffB=0,diff=0;
		int value = 0;
		
		if(sizeOfA==1 && sizeOfB==1)return 0;
		
		for(int i=0; i < sizeOfA-1; i++) {
			diffA = path(A[i],A[i+1]);
			diffB = path(B[i],B[i+1]);
			if(diffA>=diffB) {
				diff=diffA;
			}
			else if(diffB>diffA){
				diff=diffB;
			}
			value=diff+value;
		}		
		return value;
	}
	
	public int path(int x0, int x1) {
		if(x0 >= x1) {
			return Math.abs(x0-x1);
		}
		else {
			return Math.abs(x1-x0);
		}
	}
	
	/**
	 * actual solution. use Math.abs() to get positive integer. Math.max(x,y) to get maximum integer.
	 * @param A
	 * @param B
	 * @return
	 */
	public int coverPoints(int[] A, int[] B) {
		int c = 0, maxi;
		for (int i = 0; i < A.length - 1; i++) {
			maxi = Math.max(Math.abs(A[i] - A[i + 1]), Math.abs(B[i] - B[i + 1]));
			c = c + maxi;
		}
		return c;
	}
	
	public static void main(String[] args) {
		
	}
}
