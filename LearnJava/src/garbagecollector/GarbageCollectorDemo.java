package garbagecollector;

public class GarbageCollectorDemo {

	int ObjId;
	
	public GarbageCollectorDemo(int ObjId) {
		this.ObjId=ObjId;
		System.out.println("Created: "+this.ObjId);
	}

	public static void main(String[] args) {
		for(int i = 1;i < 100000; i++)
		{
			new GarbageCollectorDemo(i);
		}
	}
	
	@Override
	protected void finalize()
	{
		System.out.println(this+" Finalized "+ObjId);
	}
}
