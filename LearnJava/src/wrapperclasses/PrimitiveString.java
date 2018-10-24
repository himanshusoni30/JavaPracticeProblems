package wrapperclasses;

public class PrimitiveString {
	public static void main(String[] args) {
		byte x = 100;
		String s = Byte.toString(x);
		
		byte b = Byte.parseByte(s);
		System.out.println(x+", "+s+", "+b);
		
		
		int i = 10;
		String str = Integer.toString(i);
		
		int a = Integer.parseInt(str);
		System.out.println(i+", "+str+", "+a);
		
	}
}
