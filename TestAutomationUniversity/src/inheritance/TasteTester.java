package inheritance;

public class TasteTester {

	public static void main(String args[]) {
		BirthdayCake bc = new BirthdayCake("strawberry", 5);
		System.out.println("The cost of BirthDay Cake of flavor " + bc.getFlavor() + " is: $"
				+ String.format("%.2f", bc.birthdayCakePrice(bc.getFlavor(), bc.getCandles())));

		WeddingCake wc = new WeddingCake("chocolate", 6);
		System.out.println("The cost of Wedding Cake of flavor " + wc.getFlavor() + " is: $"
				+ String.format("%.2f", wc.weddingCakePrice(wc.getFlavor(), wc.getTiers())));
	}

}
