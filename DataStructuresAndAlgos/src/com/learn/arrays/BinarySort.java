package com.learn.arrays;

public class BinarySort {
    public static void sort(int arr[],int n)
    {
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<1)
            {
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args)
    {
        int[] binaryarray={0,1,1,0,1,0,1,0,0,1};
        int length=binaryarray.length;

        sort(binaryarray,length);
    }
}
