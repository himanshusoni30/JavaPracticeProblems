package polymorphism;

public class Banana extends Fruit{
	public Banana() {
		setCalories(300);
	}
	
	public void peel() {
		System.out.println("Peel this banana.It contains calories: " + calories);
	}
	
	public void makeJuice() {
		System.out.println("Shake is made of Banana.");
	}
}
