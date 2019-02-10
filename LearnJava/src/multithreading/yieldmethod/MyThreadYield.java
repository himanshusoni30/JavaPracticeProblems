package multithreading.yieldmethod;

public class MyThreadYield extends Thread{

	public void run()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield(); // yield calls for main thread, control goes to main thread first then it process child thread.
			/*A hint to the scheduler that the current thread is willing to yield
		    its current use of a processor. The scheduler is free to ignore this
		    hint.*/
		}
	}
}
