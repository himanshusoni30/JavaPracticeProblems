package multithreading.synchronization;

public class SynchronizationDisplayMessage {
	public synchronized void sayHello(String name)
	/*
	 * synchronized keyword is used to take a lock by thread, when thread acquires a lock the preceding threads will
	 * wait for current thread to finish processing.
	 */
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("How are you? "+name);
		}
	}
}
