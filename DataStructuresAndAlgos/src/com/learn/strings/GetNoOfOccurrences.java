package com.learn.strings;
import java.util.HashMap;

public class GetNoOfOccurrences
{
    public static void main(String[] args)
    {
        String text="Hello World Organization";
        int strlen=text.length();
        HashMap<Character,Integer> numChars=new HashMap<Character,Integer>();

        for(int i=0;i<strlen;i++)
        {
            char charAt = text.charAt(i);
            if(!numChars.containsKey(charAt))
            {
                numChars.put(charAt,1);
            }
            else
            {
                numChars.put(charAt, numChars.get(charAt)+1);
            }
        }
        System.out.println(numChars);
    }
}