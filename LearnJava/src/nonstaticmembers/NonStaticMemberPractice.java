package nonstaticmembers;

public class NonStaticMemberPractice {

	int x;
	
	public NonStaticMemberPractice() {
		System.out.println("Inside constructor");
	}
	
	//define non static block
	{
		System.out.println("Inside non-static block 1");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
		System.out.println("Non static block and constructor get executed for each new object.");
		new NonStaticMemberPractice();
		new NonStaticMemberPractice();
		new NonStaticMemberPractice();
	}
	
	static {
		System.out.println("Inside static block.");
	}
}
