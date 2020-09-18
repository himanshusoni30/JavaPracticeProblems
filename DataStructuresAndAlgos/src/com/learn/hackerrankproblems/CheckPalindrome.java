package com.learn.hackerrankproblems;
import java.util.Scanner;
public class CheckPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb = new StringBuilder(A);
        if(A.equalsIgnoreCase(String.valueOf(sb.reverse())))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
