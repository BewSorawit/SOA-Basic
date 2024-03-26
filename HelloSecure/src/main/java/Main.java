import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Main {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/test_soa_secure";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";
	static Connection dbConnection = null;
	static Statement statement = null;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String insertTableSQL = "INSERT INTO customer (NAME, SERNAME, username, pwd, USERROLES) VALUES "
				+ "('HelloHibernate', 'LastName', 'username123', 'password123', 'CLIENT')";
		dbConnection = getDBConnection();
		statement = (Statement) dbConnection.createStatement();
		statement.executeUpdate(insertTableSQL);
	}

	private static Connection getDBConnection() {
		Connection dbConnection = null;
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			dbConnection = (Connection) DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}

}
