package multithreading.synchronization.lockblock;

public class SynchronizationDisplayMessage {
	public void sayHello(String name)
	
	{
		System.out.println("Execution before synchronized block.");
		synchronized (this) {
			/*
			 * synchronized keyword is used to take a lock by thread, 
			 * when thread acquires a lock on object (new object 
			 * or a class for eg: synchronized(SynchronizedDisplayMessage.class  or this keyword which 
			 * refers to current object) 
			 * that is passed in parameters, the preceding threads will
			 * wait for current thread to finish processing of synchronized(){} block.
			 * Advantage: multiple threads can access to method and process the code until
			 * it reaches to the synchronized block. This will reduce the wait time and 
			 * improve the performance of system.
			 */

			for (int i = 0; i < 10; i++) {
				System.out.println("How are you? " + name);
			}
		}
	}
}
