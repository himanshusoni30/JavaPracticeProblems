package multithreading.synchronization.lockblock;

public class SynchronizationDemo {

	public static void main(String[] args) {
		SynchronizationDisplayMessage dm = new SynchronizationDisplayMessage();
		SynchronizationMyThread t1 = new SynchronizationMyThread(dm, "Steve");
		SynchronizationMyThread t2 = new SynchronizationMyThread(dm, "Mark");

		t1.start();
		t2.start();
	}
}
