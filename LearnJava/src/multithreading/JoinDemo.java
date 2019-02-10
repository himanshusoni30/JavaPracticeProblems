package multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int number, sum = 0;

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis(); // get the current time when line executes.
		System.out.println("Sum of the first n numbers.");
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		JoinDemo.number = scan.nextInt();

		JoinDemo jd = new JoinDemo();
		jd.start();
		jd.join(); //Waits for current thread to die then proceed further. In current program it will call run method first
		// then after completion or thread operation is completed the control goes to below print statement.
		// The usage is seen when one thread process wait for other thread to process or dependency cases.
		System.out.println("The number is: " + JoinDemo.number + ", Sum of number is: " + JoinDemo.sum);
		long end = System.currentTimeMillis();
		
		System.out.println("Total time taken by thread to process: "+(end - start)/1000+" seconds");
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.number; i++) {
			JoinDemo.sum = i + JoinDemo.sum;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
