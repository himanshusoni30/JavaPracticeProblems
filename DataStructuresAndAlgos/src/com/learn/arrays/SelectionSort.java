package com.learn.arrays;

public class SelectionSort
{
    public void swapArray(int array[], int i, int j)
    {
        if(i==j)
        {
            return;
        }
        else
        {
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }

    public static void main(String[] arg)
    {
        SelectionSort obj=new SelectionSort();
        int[] intArray={20,35,-15,7,55,1,-22};
        for(int i=intArray.length-1;i>0;i--) //i is checked till position length-1 because comparison of last index's element is
        //of no use. For eg: intArray[i]>intArray[j] where i=j=6.
        {
            int largest=0;
            for(int j=1;j<=i;j++)
            {
                if(intArray[j] > intArray[largest])
                {
                    largest=j;
                }
            }
            System.out.println("largest: "+largest+", Index i: "+i);
            obj.swapArray(intArray,largest,i);
        }
        for(int k=0;k<intArray.length;k++)
        {
            System.out.println("Index: "+k+", ElementAfterSort: "+intArray[k]);
        }
    }
}
