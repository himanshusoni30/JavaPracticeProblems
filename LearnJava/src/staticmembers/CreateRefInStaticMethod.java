package staticmembers;

public class CreateRefInStaticMethod {

	static CreateRefInStaticMethod obj = new CreateRefInStaticMethod();
	
	static {
		System.out.println(obj); 
		obj = init();
	}
	
	public static void main(String[] args) {
		System.out.println(obj);
	}
	
	/*public static void init()
	{
		obj = new CreateRefInStaticMethod();
	}*/
	
	public static CreateRefInStaticMethod init()
	{
		return new CreateRefInStaticMethod();
	}
}
