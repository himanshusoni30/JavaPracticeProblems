package staticmembers;

public class ObjectReference {
	
	int x;
	
	public ObjectReference() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		ObjectReference obj1 = new ObjectReference();
		System.out.println(obj1);
	}
	
	//no need to call static block inside main, it will be executed automatically
	public static void main(String args[])
	{
		ObjectReference obj = new ObjectReference();
		System.out.println(obj.x);
	}
}
