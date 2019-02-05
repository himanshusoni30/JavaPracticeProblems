package exceptionhandling;

public class TestCustomUnCheckedException {
	public static void main(String[] args){
		TestCustomUnCheckedException obj = new TestCustomUnCheckedException();
		obj.test();
		throw new UncheckedCustomExceptions("Data not found exception occurred.");		
	}	
	public void test()
	{
		try {
			throw new CheckCustomException("Data not found exception need to be handled");
		} catch (CheckCustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
