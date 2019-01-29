package Abstraction;

public class Test {
	
	public static void main(String[] args) {
		//Audi audi = new Audi(); // this cannot be instantiated because Audi class is abstract
		
		System.out.println("======================================================");
		QSeries qseries = new QSeries();
		qseries.accelerate();
		qseries.commonFunction();
		qseries.speed();
		System.out.println("======================================================");
		ASeries aseries = new ASeries();
		aseries.accelerate();
		aseries.commonFunction();
		aseries.speedASeries();
		System.out.println("======================================================");
	}
}
