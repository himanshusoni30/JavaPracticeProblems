package hackerearthproblems;
import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrences
{
    public static void main(String[] args)
    {
        Scanner str=new Scanner(System.in);
        String input=str.nextLine();
        int c;
        int[] count=new int[10];
        String[] strarr=new String[input.length()];
        Arrays.fill(count,0);
        for(int i=0;i<input.length();i++)
        {
            c=Integer.parseInt(String.valueOf(input.charAt(i)));
            count[c]++;
        }
        for(int j=0;j<10;j++)
        {
            System.out.println(j+" "+count[j]);
        }
    }
}
