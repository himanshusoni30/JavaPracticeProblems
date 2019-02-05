package encapsulation;

public class RetrievePatientInfo {
	public static void main(String[] args) {
		Patient p = new Patient();
		p.setId(12345);
		p.setName("Anonymous");
		p.setSsn("ABCD0987");
		
		System.out.println("Id: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("SSN: "+p.getSsn());
	}
}
