package multithreading.assignment;

public class OddNumberThreads extends Thread{
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Odd Numbers Thread.");
			for(int i = 1;i<=10;i++)
			{
				if(i%2!=0)
				{
					System.out.print(i+"\t");
				}
			}
			System.out.println();
		}		
	}
}
