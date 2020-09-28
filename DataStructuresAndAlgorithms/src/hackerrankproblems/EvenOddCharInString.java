package hackerrankproblems;
import java.util.*;

public class EvenOddCharInString
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<T;i++)
        {
            String str=scan.nextLine();
            for(int j=0;j<str.length();j=j+2)
            {
                System.out.print(str.charAt(j));
            }
            System.out.print(" ");
            for(int k=1;k<str.length();k=k+2)
            {
                System.out.print(str.charAt(k));
            }
            System.out.print("\n");
        }
    }
}
