package hackerearthproblems;
import java.util.Scanner;
public class InputOutput
{
    public static void main(String args[] )
    {
        String S=null;
        //Scanner
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();

        Scanner str = new Scanner(System.in);
        if(str.hasNext())
        {
            S = str.nextLine();
        }

        if((N>=0 && N<=10) && (S.length()>=1 && S.length()<=15))
        {
            System.out.println(2*N);
            System.out.println(S);
        }
    }
}
