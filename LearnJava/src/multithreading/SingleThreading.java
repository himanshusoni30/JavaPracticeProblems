package multithreading;

public class SingleThreading {

	public static void main(String[] args) {
		SingleThreading st = new SingleThreading();
		st.printNumbers();
		for (int j = 1; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
		}
	}

	public void printNumbers() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
		}
	}
}
