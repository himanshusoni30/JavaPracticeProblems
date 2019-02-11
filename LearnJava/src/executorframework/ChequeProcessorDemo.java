package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChequeProcessorDemo {

	public static void main(String[] args) {
		ChequeProcessor[] cp = { new ChequeProcessor("ATM"), new ChequeProcessor("Bank"), new ChequeProcessor("Mobile"),
				new ChequeProcessor("Website") };

		ExecutorService service = Executors.newFixedThreadPool(2);

		for (ChequeProcessor chequeProcessor : cp) {
			service.submit(chequeProcessor);
		}

		service.shutdown();
	}
}
