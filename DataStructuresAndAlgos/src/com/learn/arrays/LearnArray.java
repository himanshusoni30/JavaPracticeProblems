package com.learn.arrays;

public class LearnArray
{
    public static void main(String[] arg)
    {
        int[] intArray;
        intArray  = new int[] {20,35,-15,7,55,1,-22};
        for(int i=0;i<intArray.length;i++)
        {
            System.out.println("Index: "+i+", Element: "+intArray[i]);
        }
    }
}
