package garbagecollector;

public class GarbageCollectorRequest {

	int ObjId;
	
	public GarbageCollectorRequest(int ObjId) {
		this.ObjId=ObjId;
		System.out.println("Created: "+this.ObjId);
	}

	public static void main(String[] args) {
		new GarbageCollectorRequest(1);
		new GarbageCollectorRequest(2);
		for(int i = 1;i < 100; i++)
		{
			System.gc();
		}
	}
	
	@Override
	protected void finalize()
	{
		System.out.println(this+" Finalized "+ObjId);
	}
}
