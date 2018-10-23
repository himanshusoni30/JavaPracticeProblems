package staticmembers;

public class ThisKeyWord {

	int x;
	
	public ThisKeyWord() {
		System.out.println(this); 
		//this keyword will refer the address of current object in memory -- used
		//only in non-static context.
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		new ThisKeyWord();
		new ThisKeyWord();
	}
}
