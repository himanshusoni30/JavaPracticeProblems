package polymorphism;

public class TreeInterfaceImplementation {
	public static void main(String[] args) {
		Trees t1 = new Mango(); // upcasting of child class object to parent class object
		t1.releaseOxygen();
		t1.takeCarbonDiOxide();
		
		Trees t2 = new MapleTree();
		t2.releaseOxygen();
		t2.takeCarbonDiOxide();
		
		MapleTree mt = (MapleTree) t1; // downcasting of parent class object to child class object
	}
}
