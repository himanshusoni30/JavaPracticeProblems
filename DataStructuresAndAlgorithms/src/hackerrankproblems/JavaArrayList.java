package hackerrankproblems;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList
{
    public static void main(String[] args)
    {
        int n,d,q,x,y;
        int[] res;
        ArrayList<ArrayList<Integer>> arrlist=new ArrayList<ArrayList<Integer>>();
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        while(n>0)
        {
            ArrayList<Integer> row=new ArrayList<Integer>();
            d=scan.nextInt();
            for(int i=0;i<d;i++)
            {
                row.add(scan.nextInt());
            }
            arrlist.add(row);
            n--;
        }
        q=scan.nextInt();
        for(int i=0;i<q;i++)
        {
            x=scan.nextInt();
            y=scan.nextInt();
            try
            {
                System.out.println(arrlist.get(x-1).get(y-1));
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}
