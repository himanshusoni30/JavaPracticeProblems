package executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
	public static void main(String[] args) {
		MyCallable[] mc = { new MyCallable(5), new MyCallable(10), new MyCallable(15), new MyCallable(20),
				new MyCallable(25) };

		ExecutorService service = Executors.newFixedThreadPool(3);

		for (MyCallable myCallable : mc) {
			Future<Integer> future = service.submit(myCallable);
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
	}
}
