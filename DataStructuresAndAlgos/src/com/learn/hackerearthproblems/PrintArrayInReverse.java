package com.learn.hackerearthproblems;
import java.util.Scanner;

public class PrintArrayInReverse
{
    public static void main(String[] args)
    {
        /*Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        if(N>=1 && N<=100)
        {
            int[] A = new int[N];

            for(int j=0;j<N;j++)
            {
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                if(i>=0 && i<=1000)
                {
                    A[j]=i;
                }
                else
                {
                    return;
                }
            }

            for(int prt=A.length-1;prt>=0;prt--)
            {
                System.out.println(A[prt]);
            }
        }
        else
        {
            return;
        }*/

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        if(N>=1 && N<=100)
        {
            int[] A = new int[N];
            Scanner sc = new Scanner(System.in);
            if(sc.hasNext())
            {
                for(int j=0;j<N;j++)
                {
                    int i = sc.nextInt();
                    if(i>=0 && i<=1000)
                    {
                        A[j]=i;
                    }
                    else
                    {
                        return;
                    }
                }
                sc.close();
            }

            for(int prt=N-1;prt>=0;prt--)
            {
                System.out.println(A[prt]);
            }
        }
        else
        {
            return;
        }
        s.close();
    }
}
