package binarysearch;

import java.util.Scanner;

public class numberOfOccurrences {
	/**
	 * Method to find out the count of elements in array.
	 * @param A
	 * @param B
	 * @return
	 */
	public static int findCount(final int[] A, int B) {
        int lastIndex = numberOfOccurrences.lastOccurrence(A,B);
        System.out.println("lastIndex:"+lastIndex);
        int firstIndex = numberOfOccurrences.firstOccurrence(A,B);
        System.out.println("firstIndex:"+firstIndex);
        int count = 0;
        if(lastIndex != -1 && firstIndex != -1){
            count = (lastIndex - firstIndex) + 1;
        }
        return count;
    }
    
	/**
	 * Method to calculate last occurrence of element
	 * @param A
	 * @param B
	 * @return
	 */
    public static int lastOccurrence(int[] A, int B){
        int start = 0;
        int end = A.length-1;
        int result = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(B == A[mid]){
                result = mid;
                start = mid+1;
            }
            else if(B < A[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return result;
    }
    /**
     * Method to calculate first element in array.
     * @param A
     * @param B
     * @return
     */
    
    public static int firstOccurrence(int[] A, int B){
        int start = 0;
        int end = A.length-1;
        int result = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(B == A[mid]){
                result = mid;
                end = mid-1;
            }
            else if(B < A[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return result;
    }
    
    /**
     * Single method which will return first index and last index based on flag.
     * @param A
     * @param B
     * @param firstIndex
     * @return
     */
    public static int firstOrLastIndex(int A[],int B,boolean firstIndex) {
    	int start = 0;
        int end = A.length-1;
        int result = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(B == A[mid]){
                result = mid;
                if(firstIndex) {
                	end = mid-1;
                }
                else {
                	start = mid+1;
                }                
            }
            else if(B < A[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return result;
    }
    
    /**
     * main method
     * @param args
     */
    public static void main(String args[]) {
		int arr[]= {2, 5, 5, 5, 5, 20, 25, 30};
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a number from array [2, 5, 5, 5, 5, 20, 25, 30]:");
		int x = scan.nextInt();
		int output = numberOfOccurrences.findCount(arr, x);
		System.out.println("Approach1 - Number of occurrences of element "+x+" is: "+output);
		
		System.out.println("==========================================================================");
		
		/**
		 * better approach no need to write separate methods for finding last index and first index.
		 */
		int firstIndex = numberOfOccurrences.firstOrLastIndex(arr, x, true);
		if(firstIndex == -1) {
			System.out.println("Element"+x+" does not exist in array.");
		}
		else {
			int lastIndex = numberOfOccurrences.firstOrLastIndex(arr, x, false);
			System.out.println("Approach2 - Number of occurrences of element "+x+" is: "+(lastIndex-firstIndex+1));
		}
	}
}
