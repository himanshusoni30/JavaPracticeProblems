package com.learn.arrays;

public class InsertionSort
{
    public static void main (String arg[])
    {
        int intArray[]={20,35,-15,7,55,1,-22};

        for(int lastSortedArray=1;lastSortedArray<intArray.length;lastSortedArray++)
        {
            int newElement=intArray[lastSortedArray];
            int i;

            for(i=lastSortedArray ; i>0 && intArray[i-1] > newElement ; i--)
            {
                intArray[i]=intArray[i-1];
//                System.out.println(intArray[i]);
            }
//            System.out.println(i);
            intArray[i]=newElement;
        }

        for(int k=0;k<intArray.length;k++)
        {
            System.out.println("Index: "+k+", Element: "+intArray[k]);
        }
    }
}
