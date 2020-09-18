package com.learn.recursions;

public class Fibonacci
{
    public static int fib(int n)
    {
        if(n<=1)
            return n;

        return fib(n-1)+fib(n-2);
    }

    public static void main (String arg[])
    {
        int n=9;
        System.out.println("Evaluated through recursion: "+fib(n));

        int[] f = new int[n+2];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++)
        {
            f[i]=f[i-1]+f[i-2];
            System.out.print(f[i]+"|");
        }
        System.out.println("\nEvaluated through loop: "+f[n]);
    }
}
