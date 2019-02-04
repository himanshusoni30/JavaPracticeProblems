package polymorphism;

public class MACBookPro extends MACBook {
	@Override
	public void start() {
		System.out.println("Inside MACBookPro's start method.");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside MACBookPro's shutdown method.");
	}
	
	public void prosMethod()
	{
		System.out.println("Inside MACBookPro's prosMethod method.");
	}
}
