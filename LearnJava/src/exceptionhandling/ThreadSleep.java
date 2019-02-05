package exceptionhandling;

public class ThreadSleep {
	/*public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);
	}*/	
	
	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new MyThreadException("Custom thread unchecked exception");
		}
	}
}
