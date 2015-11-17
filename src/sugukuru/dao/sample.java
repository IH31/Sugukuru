package sugukuru.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class sample {
	
	final private String serverName = "192.168.33.12";
	final private String instanceName = "XE";
	final private String userName = "ih13";
	final private String password = "ih13";
	
	protected sample() throws ClassNotFoundException {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	
	protected Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@" + serverName +
				":1521:" + instanceName, userName, password);
	}
}
