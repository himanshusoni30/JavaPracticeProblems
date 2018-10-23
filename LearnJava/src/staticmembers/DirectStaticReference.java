package staticmembers;

public class DirectStaticReference 
{
	static DirectStaticReference obj;
	
	static {
		System.out.println("When obj is not created, default value is: "+obj); 
		obj = new DirectStaticReference();
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main method, object reference after creating object is: "+obj);
	}
}
