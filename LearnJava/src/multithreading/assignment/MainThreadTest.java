package multithreading.assignment;

public class MainThreadTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread.");
		for(int i = 1; i<=10; i++)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		
		Runnable even = new EvenNumberThreads();
		OddNumberThreads odd = new OddNumberThreads();
		Thread t = new Thread(even);
		
		synchronized(t)
		{		
			t.start();
			t.wait();
		}		
		
		odd.start();
	}
}
