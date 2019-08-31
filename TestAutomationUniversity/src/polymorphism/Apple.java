package polymorphism;

public class Apple extends Fruit {

	public Apple() {
		setCalories(150);
	}

	public void removeSeeds() {
		System.out.println("Remove the seeds from Apple. It contains calories: " + calories);
	}
	
	@Override
	public void makeJuice() {
		System.out.println("Juice is made of Apple.");
	}
}
