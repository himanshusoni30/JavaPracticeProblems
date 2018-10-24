package wrapperclasses;

public class PrimitiveObject {
	public static void main(String[] args) {
		int i = 100;
		Integer y = Integer.valueOf(i);
		int z = y.intValue();
		
		System.out.println(i+", "+y+", "+z);
	}
}
