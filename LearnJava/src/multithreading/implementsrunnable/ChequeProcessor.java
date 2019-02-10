package multithreading.implementsrunnable;

public class ChequeProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Processed the cheque.");
	}

	public static void main(String[] args) {
		ChequeProcessor cp = new ChequeProcessor();
		Thread t = new Thread(cp);// Thread(Runnable target) constructor
		t.start();
	}
}
