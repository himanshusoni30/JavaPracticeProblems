package inheritance;

public class Cake {

	protected double price;
	protected String flavor;
	
	public Cake(String flavor) {
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double returnPrice(String flavor) {
		if(flavor.equalsIgnoreCase("strawberry")) {
			return 50;
		}
		else if(flavor.equalsIgnoreCase("pineapple")) return 60;
		else if(flavor.equalsIgnoreCase("chocolate")) return 70;
		else return 0;
	}
}
