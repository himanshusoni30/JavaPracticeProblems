package hackerrankproblems;
import java.util.Scanner;

public class JavaSubstringCompare
{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int n=scan.nextInt();
        String temp=s.substring(0,n);
        String temp1=s.substring(0,n);
//        String min;
        for(int i=1;i<s.length()-(n-1);i++)
        {
            System.out.println("Loop :"+i+" "+temp.compareTo(s.substring(i,i+n))+" "+s.substring(i,i+n));
            if(temp.compareTo(s.substring(i,i+n))>0)
            {
                temp=s.substring(i,i+n);
                System.out.println("temp: "+temp);
            }
            System.out.println("Loop :"+i+" "+temp1.compareTo(s.substring(i,i+n))+" "+s.substring(i,i+n));
            if(temp1.compareTo(s.substring(i,i+n))<0)
            {
                temp1=s.substring(i,i+n);
                System.out.println("temp1: "+temp);
            }
            System.out.println("==================================");
        }
        System.out.println(temp);
        System.out.println(temp1);
    }
}
