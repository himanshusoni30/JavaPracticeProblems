package strings;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseWordsInString
{
    public static void main(String[]  args)
    {
        String str="The brown fox jumps over a lazy dog";
        /*Scanner scan=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(scan.nextLine());

        System.out.println(sb.reverse().toString());
        String reverse=sb.reverse().toString();*/

        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);

        String[] arr=reverse.split(" ");
        String temp="";
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr[i].length()-1;j>=0;j--)
            {
                temp=temp+arr[i].charAt(j);
            }
            temp=temp+" ";
        }
        System.out.print(temp);

        String[] tempstr=str.split(" ");
        String result="";
        for(int k=0;k<tempstr.length;k++)
        {
            if(k==tempstr.length-1)
            {
                result=tempstr[k]+result;
            }
            else
            {
                result=" "+tempstr[k]+result;
            }
        }
        System.out.println("\n"+result);

    }
}
