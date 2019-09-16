package binarysearch;

import java.util.ArrayList;
import java.util.List;

public class ValueOfMinIndex {
	public static int findMin(final List<Integer> a) {
	    int low=0, high = a.size()-1;
        int n=a.size();
        while(low<=high) {
            //if array is sorted then this condition will find the minimum index
            if(a.get(low) <= a.get(high)) {
                return a.get(low);
            }
            int mid = low + (high-low)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            //pivot property, when pivot element is less than previous and next element
            if(a.get(mid) <= a.get(next) && a.get(mid) <= a.get(prev)) {
                return a.get(mid);
            }
            // if mid element is less than or equals high and minimum element is not found then
            // discard this segment
            else if(a.get(mid) <= a.get(high)) {
                high = mid-1;
            }    
            // if mid element is greater than or equals low and minimum element is not found then
            // discard this segment
            else if(a.get(mid) >= a.get(low)) {
                low = mid+1;
            }    
        }        
        return -1;
	}
	
	public static void main(String[] args) {
		List<Integer> a= new ArrayList<Integer>(); //array should be circularly sorted or sorted
		a.add(21);a.add(27);a.add(29);a.add(30);a.add(34);a.add(12);a.add(15);a.add(17);
		int rotation = ValueOfMinIndex.findMin(a);
		System.out.println("Value at minimum index is "+rotation);
	}
}
