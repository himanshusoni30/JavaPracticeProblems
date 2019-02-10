package multithreading;

public class ThreadIdentity extends Thread {

	public static void main(String[] args) throws InterruptedException {
		ThreadIdentity mt = new ThreadIdentity();
		mt.start();
		mt.join();
		Thread currentThread = Thread.currentThread(); //get the name of current thread.
		System.out.println("Thread name is "+currentThread);		
	}

	public void run() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("Not main"); //set the name of thread
		System.out.println("Thread name is "+currentThread);
	}
}
