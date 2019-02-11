package executorframework;

public class ChequeProcessor implements Runnable {

	String name;

	public ChequeProcessor(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + ": Cheque Processor has started processing the cheque. Thread Name:"
				+ Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + ": Cheque Processor has processed the cheque successfully. Thread Name:"
				+ Thread.currentThread().getName());
	}

}
