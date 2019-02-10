package multithreading.synchronization.classlock;

public class SynchronizationDemo {

	public static void main(String[] args) {
		SynchronizationMyThread t1 = new SynchronizationMyThread( "Steve");
		SynchronizationMyThread t2 = new SynchronizationMyThread("Mark");

		t1.start();
		t2.start();
	}
}
