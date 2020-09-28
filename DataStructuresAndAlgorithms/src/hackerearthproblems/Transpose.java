package hackerearthproblems;
import java.util.Scanner;

public class Transpose
{
    /*public staticpack void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String strinp=s.nextLine();
        String[] str=strinp.split("\\s");
        int[] rowcol=new int[str.length];

        for(int i=0;i<str.length;i++)
        {
            rowcol[i]=Integer.parseInt(str[i]);
        }

        Scanner rline=new Scanner(System.in);
        int[][] matrix=new int[rowcol[0]][rowcol[1]];
        int[][] transmatrix=new int[rowcol[1]][rowcol[0]];
        for(int numoflines=0;numoflines<rowcol[0];numoflines++)
        {
            if(rline.hasNext())
            {
                String inputline=rline.nextLine();
                String[] strarr=inputline.split("\\s");
                for(int c=0;c<strarr.length;c++)
                {
                    matrix[numoflines][c]=Integer.parseInt(strarr[c]);
                }
            }
        }


        for(int a=0;a<rowcol[0];a++)
        {
            for(int b=0;b<rowcol[1];b++)
            {
                transmatrix[b][a]=matrix[a][b];
//                System.out.print(transmatrix[b][a]+" ");
            }
//            System.out.print("\n");
        }

        for (int c = 0; c < rowcol[1]; c++)
        {
            for (int d = 0; d < rowcol[0]; d++)
                System.out.print(transmatrix[c][d]+"\t");

            System.out.print("\n");
        }
    }*/

    /*@approach 2

     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = inp.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
