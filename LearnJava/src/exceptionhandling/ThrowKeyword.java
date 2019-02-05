package exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		ThrowKeyword obj = new ThrowKeyword();
		obj.checkedExceptions();
		throw new RuntimeException("Data not found.");	
	}

	public void checkedExceptions()
	{
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Throwing checked exception.");
		}
	}
}
