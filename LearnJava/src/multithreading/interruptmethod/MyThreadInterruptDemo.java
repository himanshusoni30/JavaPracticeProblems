package multithreading.interruptmethod;

public class MyThreadInterruptDemo {

	public static void main(String[] args) {
		MyThreadInterrupt t = new MyThreadInterrupt();
		t.start();
		
		t.interrupt();//Interrupts the thread that is started inside MyThreadInterrupt Class.
		
		System.out.println("End of Main Thread.");
	}
}
