package hackerrankproblems;
import java.util.Scanner;

public class StringSplitToken
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int len=s.length();
        String[] arr={};
        if(len>=1 && len<= 4*Math.pow(10,5) && s!=null && !s.trim().isEmpty())
        {
            arr=s.trim().split("[ !,?.\\_'@]+");
        }
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        scan.close();
    }
}
