package polymorphism;

public class MapleTree implements Trees{
	@Override
	public void releaseOxygen() {
		System.out.println("Maple tree releaseOxygen.");		
	}

	@Override
	public void takeCarbonDiOxide() {
		System.out.println("Maple tree takeCarbonDiOxide.");		
	}
}
