package Interfaces;

public class AccessLaptops {
	public static void main(String[] args) {
		TouchScreenLaptops hpnb = new HPNotebook();
		hpnb.scroll();
		hpnb.click();
		
		System.out.println("======================================");
		
		TouchScreenLaptops dnb = new DellNoteBook();
		dnb.scroll();
		dnb.click();
	}	
}
