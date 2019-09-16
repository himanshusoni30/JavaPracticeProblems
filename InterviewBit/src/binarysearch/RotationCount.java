package binarysearch;

public class RotationCount {
	public static int findCount(int arr[]) {
		int low=0, high = arr.length-1;
		int n=arr.length;
		while(low<=high) {
			//if array is sorted then this condition will find the minimum index
			if(arr[low] <= arr[high]) {
				return low;
			}
			int mid = low + (high-low)/2;
			int next = (mid+1)%n;
			int prev = (mid+n-1)%n;
			//pivot property, when pivot element is less than previous and next element
			if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
				return mid;
			}
			// if mid element is less than or equals high and minimum element is not found then
			// discard this segment
			else if(arr[mid] <= arr[high]) {
				high = mid-1;
			}	
			// if mid element is greater than or equals low and minimum element is not found then
			// discard this segment
			else if(arr[mid] >= arr[low]) {
				low = mid+1;
			}	
		}		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {21, 25, 27, 29,30,34, 12, 15, 17,18}; //array should be circularly sorted or sorted
		int rotation = RotationCount.findCount(arr);
		System.out.println("Array is rotated "+rotation+" number of times.");
	}
}
