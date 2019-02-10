package multithreading.yieldmethod;

public class MyThreadYieldDemo {
	public static void main(String[] args) {
		MyThreadYield t = new MyThreadYield();
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
