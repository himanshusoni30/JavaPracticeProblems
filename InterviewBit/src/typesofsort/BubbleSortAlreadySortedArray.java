package typesofsort;

public class BubbleSortAlreadySortedArray {
	public int[] sortArrayAsc(int[] arr)
	{
		int[] a = arr;
		for(int i=1; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				int flag=0;
				if(a[j] > a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
					flag=1;
					System.out.println(flag);
				}
				if(flag==0)
				{
					break;
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
				int flag=0;
				if(a[j] > a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
					flag=1;
					System.out.println(flag);
				}
				if(flag==0)
				{
					break;
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
		int[] arr = {1,2,3,4,5,6,7,8};
		int[] arr2 = {8,7,6,5,4,3,2,1};
		System.out.print("Array before sorting:\n"); 
		obj.dispSortedArray(arr);
		obj.sortArrayAsc(arr);
		System.out.println("\n\nArray after sorting in ascending order: "); 
		obj.dispSortedArray(arr);
		obj.sortArrayDesc(arr2);
		System.out.println("\n\nArray after sorting in descending order: ");
		obj.dispSortedArray(arr2);
	}

}
