package polymorphism;

public class Market {
	public static void main (String args[]) {
		Apple apple = new Apple();
		apple.removeSeeds();
		
		Banana banana = new Banana();
		banana.peel();
		
		Fruit pineapple = new Fruit();
		
		typeOfFruit(apple);
		typeOfFruit(banana);
		typeOfFruit(pineapple);
	}
	
	public static void typeOfFruit(Fruit fruit) {
		if(fruit instanceof Apple) {
			((Apple) fruit).makeJuice();
		}
		else if(fruit instanceof Banana) {
			((Banana) fruit).makeJuice();
		}
		else {
			fruit.makeJuice();
		}
	}
}
