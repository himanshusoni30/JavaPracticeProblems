package datatypes;

public class ImplicitCast {
	/* 
	 * implicit type casting happens when value of lower data type is assigned to higher data type
	 * lower type -> higher type
	 */
	public static void main(String[] args) {
		byte b = 100;
		int i = b;
		System.out.println(i);
		
		long l = i;
		char c = 'C';
		int x = c;
		System.out.println(x);
		
		i = 140;
		b = (byte)i;
		System.out.println(b);
		
		i = 612;
		b = (byte)i;
		c = (char)b;
		System.out.println(c);
	}
}
