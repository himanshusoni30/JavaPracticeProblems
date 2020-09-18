package com.learn.arrays;

public class ShellSort
{
    public static void main (String arg[])
    {
        int intArray[]={20,35,-15,7,55,1,-22};

        for(int gap = intArray.length/2; gap > 0; gap/=2)
        {
            for(int i=gap; i<intArray.length; i++)
            {
                int newElement = intArray[i];
                int j=i;

                while( j >= gap && intArray[j - gap] > newElement)
                {
                    intArray[j]=intArray[j-gap];
                    j -= gap;
                }

                intArray[j]=newElement;
            }
        }

        for(int k=0;k<intArray.length;k++)
        {
            System.out.println("Index: "+k+", Element: "+intArray[k]);
        }
    }
}
