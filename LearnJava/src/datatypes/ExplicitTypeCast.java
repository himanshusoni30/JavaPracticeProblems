package datatypes;

public class ExplicitTypeCast {
	public static void main(String[] args) {
		/* 
		 * explicit type casting happens when value of higher data type is assigned to lower data type
		 *  higher type -> lower type
		 */
		int i = 100;
		byte b = (byte)i;
		System.out.println(b);
		
		double d = 12345.67890;
		float f = (float)d;
		System.out.println(f);
		
		char c = (char)i;
		System.out.println(c);
		
	}
}
