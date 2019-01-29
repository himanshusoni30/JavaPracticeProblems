package Abstraction;

public abstract class Audi {
	public void commonFunction()
	{
		System.out.println("Inside Audi Class commonFunction method.");
	}
	
	abstract void accelerate();
	
	public static void main(String[] args) {
		System.out.println("Inside main method. Main method can be created inside abstract class \n"
				+ "because it uses static keyword and does not require any object to invoke it."
				+ "Once class is marked as abstract it cannot be instantiated.");
	}

}
