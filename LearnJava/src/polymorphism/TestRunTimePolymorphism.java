package polymorphism;

public class TestRunTimePolymorphism {
	public static void main(String[] args) {
		MACBook mb = new MACBookPro(); // upcasting child class object to parent class object
		mb.start();
		mb.shutdown();

		MACBook m = new MACBookAir();
		m.start();
		m.shutdown();

		MACBook mp = new MACBook();
		mp.start();
		mp.shutdown();

		MACBookAir m1 = (MACBookAir) m; // downcasting parent class object to child class object

		MACBookPro m2 = (MACBookPro) mb; // downcasting parent class object to child class object

		MACBookPro m3 = new MACBookPro();

		/*
		 * mb.prosMethod(); //prosMethod cannot be invoked using mb as method is inside
		 * MACBookPro class m1.prosMethod(); //prosMethod cannot be invoked using m1 as
		 * method is inside MACBookPro class
		 * 
		 * objects mb and m1 are parent class objects.
		 */

		m2.prosMethod();
		m3.prosMethod();
	}
}
