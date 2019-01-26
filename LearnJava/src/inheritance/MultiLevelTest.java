package inheritance;

public class MultiLevelTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.f1();
		c.f2();
		System.out.println(c);
		System.out.println(c.hashCode());
		System.out.println(c.getClass().getSimpleName());
	}

}
