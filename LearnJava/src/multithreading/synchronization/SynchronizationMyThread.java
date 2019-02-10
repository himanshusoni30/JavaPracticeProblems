package multithreading.synchronization;

public class SynchronizationMyThread extends Thread{
	SynchronizationDisplayMessage dm;
	String name;
	
	SynchronizationMyThread(SynchronizationDisplayMessage dm,String name)
	{
		this.dm=dm;
		this.name=name;
	}
	
	public void run()
	{
		dm.sayHello(name);
	}
}
