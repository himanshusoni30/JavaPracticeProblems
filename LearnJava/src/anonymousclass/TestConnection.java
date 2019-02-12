package anonymousclass;

public class TestConnection {
	public static void main(String[] args) {
		Connection con = DriverManager.getConnection();
		con.createStatement();
	}
}
