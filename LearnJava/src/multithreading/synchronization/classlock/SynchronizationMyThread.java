package multithreading.synchronization.classlock;

public class SynchronizationMyThread extends Thread{
	String name;
	
	SynchronizationMyThread(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		SynchronizationDisplayMessage.sayHello(name);
	}
}
