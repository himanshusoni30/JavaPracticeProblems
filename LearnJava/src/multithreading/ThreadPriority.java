package multithreading;

public class ThreadPriority extends Thread {

	public static void main(String[] args) throws InterruptedException {
		ThreadPriority mt = new ThreadPriority();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("Thread 1");
		mt.start();
		
		ThreadPriority mt1 = new ThreadPriority();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("Thread 2");
		mt1.start();
	}

	public void run() {
		System.out.println("Thread name is "+Thread.currentThread().getName());
	}
}
