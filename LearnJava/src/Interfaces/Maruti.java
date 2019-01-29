package Interfaces;

public class Maruti implements Car {

	@Override
	public void start() {
		System.out.println("Inside Car start method.");
	}

	@Override
	public void stop() {
		System.out.println("Inside Car stop method.");
	}
	
}
