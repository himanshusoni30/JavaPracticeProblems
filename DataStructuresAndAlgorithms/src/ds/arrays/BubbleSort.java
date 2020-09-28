package ds.arrays;

public class BubbleSort
{
    public void swapArray(int array[], int i, int j)
    {
        if(i==j)
        {
            return;
        }
        else
        {
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }

    public static void main(String[] arg)
    {
        BubbleSort obj=new BubbleSort();
        int[] intArray;
        intArray  = new int[] {20,35,-15,7,55,1,-22};
       /* for(int i=0;i<intArray.length-1;i++) //i is checked till position length-1 because comparison of last index's element is
            //of no use. For eg: intArray[i]>intArray[j] where i=j=6.
        {
            for(int j=i+1;j<intArray.length;j++)
            {
                if(intArray[i] > intArray[j])
                {
                    obj.swapArray(intArray,i,j);
                }
            }
        }*/
        for(int m=intArray.length-1;m>0;m--)
        {
            for(int n=0;n<m;n++)
            {
                if(intArray[n] > intArray[m])
                {
                    obj.swapArray(intArray,n,m);
                }
            }
        }
        for(int k=0;k<intArray.length;k++)
        {
            System.out.println("Index: "+k+", ElementAfterSort: "+intArray[k]);
        }
    }
}
