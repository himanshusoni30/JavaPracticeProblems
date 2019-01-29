package finalconcepts;

public class Beta extends Gama{
	
	/*public void displayValue()
	{
		
	}*/
	//displayValue method cannot be overridden because it is declared as final in class Gama.
	
	public static void main(String[] args) {
		System.out.println(Alpha.si);
	}
}
