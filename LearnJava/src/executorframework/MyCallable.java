package executorframework;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
	int number;

	MyCallable(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(
				Thread.currentThread().getName() + ": is calculating the sum of numbers this number " + number);

		int sum = 0;

		for (int i = 0; i < number; i++) {
			sum += i;
		}
		return sum;
	}

}
