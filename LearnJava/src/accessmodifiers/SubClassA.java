package accessmodifiers;

public class SubClassA extends SuperClass
{
	public void methodA()
	{
		this.testIt();
	}
	
	public void methodB()
	{
//		doNotTestIt();
	}
}
