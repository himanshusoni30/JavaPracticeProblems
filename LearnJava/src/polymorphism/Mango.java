package polymorphism;

public class Mango implements Trees{

	@Override
	public void releaseOxygen() {
		System.out.println("Mango tree releaseOxygen.");		
	}

	@Override
	public void takeCarbonDiOxide() {
		System.out.println("Mango tree takeCarbonDiOxide.");		
	}	
}
