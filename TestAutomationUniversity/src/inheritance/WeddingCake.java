package inheritance;

public class WeddingCake extends Cake{

	public WeddingCake(String flavor,int tiers) {
		super(flavor);
		this.tiers = tiers;
	}
	
	protected int tiers;

	public int getTiers() {
		return tiers;
	}

	public void setTiers(int tiers) {
		this.tiers = tiers;
	}
	
	public double weddingCakePrice(String flavor, int tiers) {
		return returnPrice(flavor)+(tiers*3);
	}
}
