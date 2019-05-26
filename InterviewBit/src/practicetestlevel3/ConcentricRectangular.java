package practicetestlevel3;

import java.util.Scanner;

public class ConcentricRectangular {
	
	public int[][] prettyPrint(int A) {
		int len = (2*A) - 1;
		int[][] arr= new int[len][len];
		int c1=0,c2=len-1,r1=0,r2=len-1,n=A;
		while(n>=1)
		{
			for(int i=c1;i<=c2;i++)
			{
				arr[r1][i]=n;
			}
			
			for(int i=r1+1;i<=r2;i++)
			{		
				arr[i][c2]=n;
			}
			
			for(int i=c2-1;i>=c1;i--)
			{
				arr[r2][i]=n;
			}
			
			for(int i=r2-1;i>=r1+1;i--)
			{
				arr[i][c1]=n;
			}
			c1++;c2--;r1++;r2--;n--;
		}
		return arr;
    }
	
	public static void main(String[] args) {
		ConcentricRectangular obj = new ConcentricRectangular();
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int a[][]=obj.prettyPrint(A);
		int l = (2*A)-1;
		for(int i=0; i<l; i++)
		{
			for(int j=0; j<l; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
			
	}

}
