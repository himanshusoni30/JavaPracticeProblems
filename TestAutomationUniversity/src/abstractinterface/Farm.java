package abstractinterface;

public class Farm {

	public static void main(String[]args) {
		Animal pig = new Pig();
		pig.eat();
		pig.makeSound();
		
		System.out.println("===================================================");
		
		Animal duck = new Duck();
		duck.eat();
		duck.makeSound();
		
		System.out.println("===================================================");
		
		Pig piggy = new Pig();
		piggy.eat();
		piggy.makeSound();
		
		System.out.println("===================================================");
		
		Duck duckie = new Duck();
		duckie.eat();
		duckie.makeSound();		
	}
}
