package wrapperclasses;

public class AllInOne {

	public static void main(String[] args) {
		int x = 100;
		String y = Integer.toString(x); //convert primitive to String
		
		Integer b = new Integer(x); // convert primitive to object
		
		int z = b.intValue(); // convert object to primitive
		
		Integer c = new Integer(z); // covert primitive to object
		String d = c.toString(); // covert object to String
		
		int e = Integer.parseInt(d); // covert String to primitive
	}

}
