package multithreading.interruptmethod;

public class MyThreadInterrupt extends Thread {
	public void run() {
		try 
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.println("I am a Lazy Thread.");
				Thread.sleep(2000);
			}				
		} catch (InterruptedException e) {
			System.out.println("Got interrupted.");
		}
	}
}
