package arraysproblem;

public class SpiralOrder {
	 public static int[] spiralOrder(final int[][] A) {
	        int m=A.length;
	        int n=A[0].length;
	        int t=0, b=m-1, l=0, r=n-1, dir=0;
	        int[] arr = new int[m*n];
	        int p=0;
	        while(t<=b && l<=r){
	            
	            if(dir==0){
	                for(int i=l; i<=r ; i++)
	                {
	                    arr[p] = A[t][i];
	                    p++;
	                }
	                t++;
	                dir = 1;
	            }
	            else if(dir==1){
	                for(int j=t; j<=b; j++)
	                {
	                    arr[p] = A[j][r];
	                    p++;
	                }
	                dir = 2;
	                r--;
	            }
	            else if(dir==2){
	                for(int i=r; i>=l; i--){
	                    arr[p]=A[b][i];
	                    p++;
	                }
	                dir=3;
	                b--;
	            }
	            else if(dir==3){
	                for(int j = b; b>=t; j--){
	                	if(j<0)break;
	                	else if(j==0 & l==0)break;
	                	else{
	                		arr[p]=A[j][l];
		                    p++;
	                	}
	                }
	                dir=0;
	                l++;
	            }
	        }
	        return arr;
	    }
	 
	 public static void main(String args[]) {
		 int[][] arr = {{1,2,7},{3,4,8},{5,6,9}};
		 int[] result = SpiralOrder.spiralOrder(arr);
		 for(int i=0;i<result.length;i++) {
			 System.out.print(result[i]+" ");
		 }
	 }
}
