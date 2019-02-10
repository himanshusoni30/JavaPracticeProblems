package multithreading.synchronization.classlock;

public class SynchronizationDisplayMessage {
	public synchronized static void sayHello(String name)
	/*
	 * synchronized static keyword is used to take a lock a class, when thread acquires a lock on class 
	 * the preceding threads will wait for current thread to finish processing on class.
	 */
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("How are you? "+name);
		}
	}
}
