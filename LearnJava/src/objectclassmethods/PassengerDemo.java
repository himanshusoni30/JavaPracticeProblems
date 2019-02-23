package objectclassmethods;

public class PassengerDemo {

	public static void main(String[] args) {
		Passenger pass = new Passenger();
		pass.setFirstName("Kutta");
		pass.setLastName("Billi");
		pass.setId(300);
		System.out.println(pass);
		System.out.println(pass.hashCode());
		
		Passenger pass2 = new Passenger();
		pass2.setFirstName("Kutta");
		pass2.setLastName("Billi");
		pass2.setId(300);
		System.out.println(pass);
		System.out.println(pass.hashCode());
		
		System.out.println(pass.equals(pass2));
	}
}
