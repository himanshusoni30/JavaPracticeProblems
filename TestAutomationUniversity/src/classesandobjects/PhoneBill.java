package classesandobjects;

public class PhoneBill {
	private int id;
	private double baseCost;
	private int allottedMins;
	private int minsUsed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}

	public int getAllottedMins() {
		return allottedMins;
	}

	public void setAllottedMins(int allottedMins) {
		this.allottedMins = allottedMins;
	}

	public int getMinsUsed() {
		return minsUsed;
	}

	public void setMinsUsed(int minsUsed) {
		this.minsUsed = minsUsed;
	}

	public PhoneBill() {
		id=0;
		baseCost=0;
		allottedMins=0;
		minsUsed=0;
	}

	public PhoneBill(int id) {
		this.id = id;
		baseCost=0;
		allottedMins=0;
		minsUsed=0;
	}

	public PhoneBill(int id, double baseCost, int allottedMins, int minsUsed) {
		this.id = id;
		this.baseCost = baseCost;
		this.allottedMins = allottedMins;
		this.minsUsed = minsUsed;
	}
}
