package objectclassmethods;

public class ElectricityBillDemo {

	public static void main(String[] args) {
		ElectricityBill eb = new ElectricityBill();
		eb.setAddress("Punter Gully");
		eb.setName("BhaiLog");
		eb.setMeterNumber(123456);
		System.out.println(eb.toString());
		System.out.println(eb.hashCode());

		ElectricityBill eb1 = new ElectricityBill();
		eb1.setAddress("Mach Mach Gully");
		eb1.setName("Bantai");
		eb1.setMeterNumber(123457);
		System.out.println(eb1.toString());
		System.out.println(eb1.hashCode());

		System.out.println(eb.equals(eb1));
	}
}
