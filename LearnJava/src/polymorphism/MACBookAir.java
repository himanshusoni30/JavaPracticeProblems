package polymorphism;

public class MACBookAir extends MACBook {
	@Override
	public void start() {
		System.out.println("Inside MACBookAir's start method.");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside MACBookAir's shutdown method.");
	}
}
