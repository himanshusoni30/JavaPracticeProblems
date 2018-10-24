package wrapperclasses;

public class ObjectString {

	public static void main(String[] args)
	{
		long x = 1000;
		Long y = Long.valueOf(x);
		
		String str = y.toString();
		
		Long value = Long.valueOf(str); 
		
		System.out.println(x+", "+y+", "+str+", "+value);
	}

}
