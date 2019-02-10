package multithreading.assignment;

public class EvenNumberThreads implements Runnable {

	@Override
	public void run() {
		synchronized(this)
		{
			System.out.println("Even Numbers Thread.");
			for (int i = 1; i <= 10; i++)
			{
				if (i % 2 == 0) {
					System.out.print(i + "\t");
				}
			}
			System.out.println();
			this.notify();
		}
	}
}
