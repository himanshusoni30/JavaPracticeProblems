package multithreading;

public class MultiThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MultiThreaded mt = new MultiThreaded();
		mt.start();
		for (int j = 1; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
			Thread.sleep(1000); // sleep method is used to hold the processing of thread for given time in sleep
								// method.
			// The use of sleep method is seen while looking for server or application to
			// connect after every given amount of time like 5 or 10 seconds.
		}
	}

	public void run() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Child thread exiting.");
			}
		}
	}
}
