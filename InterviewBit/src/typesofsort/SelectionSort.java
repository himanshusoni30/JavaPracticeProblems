package typesofsort;

public class SelectionSort {
	public int[] sortArrayAsc(int[] arr)
	{
		int[] a = arr;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		return a;
	}
	
	public int[] sortArrayDesc(int[] arr)
	{
		int[] a = arr;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		return a;
	}
	
	public void dispSortedArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + "|");
		}
	}
	
	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		int[] arr = {5,2,1,8,3,9,10};
		System.out.print("Array before sorting:\n"); 
		obj.dispSortedArray(arr);
		obj.sortArrayAsc(arr);
		System.out.println("\n\nArray after sorting in ascending order: "); 
		obj.dispSortedArray(arr);
		obj.sortArrayDesc(arr);
		System.out.println("\n\nArray after sorting in descending order: ");
		obj.dispSortedArray(arr);
	}

}
