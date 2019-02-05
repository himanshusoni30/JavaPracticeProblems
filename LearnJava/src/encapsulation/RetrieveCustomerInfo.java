package encapsulation;

public class RetrieveCustomerInfo {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		c.setFirstName("Mark");
		c.setLastName("Henry");
		c.setCreditCard("1234567823456789");
		
		System.out.println("First Name: "+c.getFirstName());
		System.out.println("Last Name: "+c.getLastName());
		System.out.println("Credit Card: "+c.getCreditCard());
	}
}
