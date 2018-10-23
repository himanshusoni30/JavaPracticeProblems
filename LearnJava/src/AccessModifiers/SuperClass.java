package AccessModifiers;

public class SuperClass 
{
	public void testIt()
	{
		System.out.println("testIt in SuperClass.");
	}
	
	private void doNotTestIt()
	{
		System.out.println("doNotTestIt in SuperClass.");
	}
	
	protected int x=9;
}
