package exceptionhandling;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("Input is: "+input);
			int output = Integer.parseInt(input);
			System.out.println("Output is: "+output);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("pass an argument.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("cannot convert string into integer, please pass integer as argument.");
		}
		finally {
			System.out.println("This will be executed always.");
		}
		
		System.out.println("code continues...");
	}
}
