package com.learn.hackerrankproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
    static boolean isAnagram(String a, String b)
    {
        boolean flag=false;
        String str1=a.toLowerCase();
        System.out.println("String 1: "+str1);
        String str2=b.toLowerCase();
        System.out.println("String 2: "+str2);
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=str1.charAt(i);
            arr2[i]=str2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==arr2[i])
            {
                flag= true;
            }
            else
            {
                flag= false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
