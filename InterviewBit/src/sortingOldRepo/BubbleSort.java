package typesofsort;

public class BubbleSort {
	public int[] sortArrayAsc(int[] arr)
	{
		int[] a = arr;
		for(int i=1; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j] > a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
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
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j] > a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
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
		int[] arr = {5,2,1,8,3,9,10,5};
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
