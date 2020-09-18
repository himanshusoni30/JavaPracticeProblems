package com.learn.hackerrankproblems;
import java.util.Scanner;

public class PrintInFormat
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int base = 1;
            int pow;
            for (int k = 0; k < n; k++) {
                if (k == 0) {
                    pow = 1;
                } else {
                    pow = base * 2;
                    base = pow;
                }
                int sum = pow * b;
                int result = a + sum;
                result = result + sum;
                System.out.print(result + " ");
            }
        }
        in.close();
    }
}

