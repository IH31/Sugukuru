package sugukuru.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author yuta
 * @since 2015/06/01
 * Dao Super Class
 */
public abstract class Dao {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "";
	private String user = "";
	private String pass = "";
	
	protected Connection connection;
		
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.url, this.user, this.pass);
	}
	
	/**
	 * Connection Start
	 */
	public void open() {
		// Class
		try { Class.forName(this.driver); } catch(ClassNotFoundException e) { }
		// Connection
		try { this.connection = this.getConnection(); } catch(SQLException e) { }
	}
	
	/**
	 * Connection Close
	 */
	public void close() {
		if(this.connection != null) {
			try { this.connection.close(); } catch(SQLException e) { }
		}
	}
}
