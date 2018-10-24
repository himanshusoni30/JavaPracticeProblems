package wrapperclasses;

public class Constructors {

	public static void main(String[] args) {
		long l = 100000;
		Long a = new Long(l);
		
		String str = "2000";
		Long b = new Long(str);
		
		System.out.println(a+", "+b);
	}

}
