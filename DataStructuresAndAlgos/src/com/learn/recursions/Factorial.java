package com.learn.recursions;

public class Factorial
{
    public static int fact(int num)
    {
        if(num == 0)
        {
            return 1;
        }

        return num*fact(num-1);
    }

    public static void main(String arg[])
    {
        int prod=1;
        System.out.println("Evaluated through recursion: "+fact(8));

        int num=8;
        int fact=1;
        for(int i=1; i<=num; i++)
        {
            fact=fact*i;
        }
        System.out.println("Evaluated through loop: "+fact);
    }
}
