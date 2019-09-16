package objectclassmethods;

public class Passenger {
	
	String FirstName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	String LastName;
	
	public String toString() {
		return "Passenger information is First Name: '"+getFirstName()+"' and Last Name: '"+getLastName()+"'";
	}
	
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int hashCode() {
		return getId()+getFirstName().length()+getLastName().length();
	}
	
	@Override
	public boolean equals(Object obj) {
		Passenger pass = (Passenger) obj;
		if(pass.getId() == this.id && pass.getFirstName() == this.FirstName && pass.getLastName() == this.LastName)
		{
			return true;
		}
		return false;
	}
}
