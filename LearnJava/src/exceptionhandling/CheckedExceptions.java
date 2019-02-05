package exceptionhandling;
import java.io.*;

public class CheckedExceptions {
	void readFile() throws FileNotFoundException //throws keyword shows that method is not 
	//going to handle exception but the caller method has to handle it. If caller method does not handle it 
	//then by default it will invoke JVMs method to return unfriendly errors.
	{
		FileInputStream fis = new FileInputStream("name");
	}
	
	public static void main(String[] args) {
		CheckedExceptions ce = new CheckedExceptions();
		try {
			ce.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}
