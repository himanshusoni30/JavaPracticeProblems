package inheritance;

public class BirthdayCake extends Cake{
	protected int candles;
	
	public int getCandles() {
		return candles;
	}

	public void setCandles(int candles) {
		this.candles = candles;
	}

	public BirthdayCake(String flavor, int candles) {
		super(flavor);
		this.candles=candles;
	}
	
	public double birthdayCakePrice(String flavor, int candles) {
		return returnPrice(flavor)+candles;
	}
}
