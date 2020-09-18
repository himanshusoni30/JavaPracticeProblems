package com.learn.strings;
import org.junit.Test;

import java.util.Scanner;
public class StrMethods
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
        str.concat("ignoreMe");
        System.out.println("\n"+str);
        System.out.println("\n"+str.concat("test"));
        System.out.println(str.length());
        System.out.println(str.replace("t","T"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,10));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.contains("rest"));
        System.out.println(str.equalsIgnoreCase("interestingPLAY"));
        System.out.println(str.toString());

        StringBuilder sb=new StringBuilder("interestingPLAY");
        System.out.println(sb.reverse().append(12345).delete(16,19).insert(10,"test"));
    }
}
