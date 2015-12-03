package sugukuru.dao2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Dao {
	
	final private String serverName = "192.168.33.12";
	final private String instanceName = "XE";
	final private String userName = "ih13";
	final private String password = "ih13";
	
	@SuppressWarnings("finally")
	protected Connection open() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + serverName +
					":1521:" + instanceName, userName, password);
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	protected void autoCommitOff(Connection conn) {
		if(conn != null) {
			try {conn.setAutoCommit(false);} catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	protected void commit(Connection conn) {
		if(conn != null) {
			try {conn.commit();} catch(SQLException e) {e.printStackTrace();}
		}
	}
	
	protected void rollback(Connection conn) {
		if(conn != null) {
			try {conn.rollback();} catch(SQLException e) {e.printStackTrace();}
		}
	}
	
	protected void close(Connection conn) {
		if(conn != null) {
			try {conn.close();} catch(SQLException e) {e.printStackTrace();}
		}
	}
	
	protected void close(Statement st) {
		if(st != null) {
			try {st.close();} catch(SQLException e) {e.printStackTrace();}
		}
	}
	
	protected void close(PreparedStatement prepare) {
		if(prepare != null) {
			try {prepare.close();} catch(SQLException e) {e.printStackTrace();}
		}
	}
	
	protected void close(ResultSet rs) {
		if(rs != null) {
			try {rs.close();} catch(SQLException e) {e.printStackTrace();}
		}
	}
	
	public abstract void closeAll();
}
