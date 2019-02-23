package objectclassmethods;

public class ElectricityBill {
	int meterNumber;

	public int getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(int meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String name;
	String address;

	@Override
	public String toString() {
		return "Bill details of customer: '" + getName() + "', residing at address: '" + getAddress()
				+ "', and meter number: " + getMeterNumber();
	}

	@Override
	public boolean equals(Object obj) {
		ElectricityBill eb = (ElectricityBill) obj;
		if (eb.getMeterNumber() == this.meterNumber) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return getMeterNumber();
	}

}
