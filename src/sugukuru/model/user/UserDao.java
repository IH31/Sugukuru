package sugukuru.model.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sugukuru.model.Dao;

/**
 * @author yuta
 * @since 2015/06/02
 * Model UserDao
 */
public class UserDao extends Dao {

	private PreparedStatement prepared;
	private Statement statement;
	private ResultSet result;

	public ArrayList<User> select(String sql, ArrayList<String> bind) {
		
		ArrayList<User> users = new ArrayList<User>();
		
		try{
			this.open();
			prepared = this.connection.prepareStatement(sql);
			
			for(int idx = 0; idx < bind.size(); idx++) {
				prepared.setString(idx, bind.get(idx));
			}
			
			result = prepared.executeQuery();
			while(result.next()) {
				users.add(new User(
						result.getString("id"),
						result.getString("password"),
						result.getString("customer_name"),
						result.getString("address"),
						result.getInt("phone"),
						result.getInt("fax"),
						result.getString("email")
						));
			}
		} catch(SQLException e) { }
		return users;
	}
	
	public ArrayList<User> select(String sql) {
		
		ArrayList<User> users = new ArrayList<User>();
		
		try{
			this.open();
			statement = this.connection.createStatement();
			result = statement.executeQuery(sql);
			while(result.next()) {
				users.add(new User(
						result.getString("id"),
						result.getString("password"),
						result.getString("customer_name"),
						result.getString("address"),
						result.getInt("phone"),
						result.getInt("fax"),
						result.getString("email")
						));
			}
		} catch(SQLException e) { }
		return users;
	}
	
	public int update(String sql, ArrayList<String> bind) {
		int ret = 0;
		try {
			this.open();
			prepared = this.connection.prepareStatement(sql);
			/**
			 * バインドセット
			 */
			ret = prepared.executeUpdate();
		} catch(SQLException e) {
			ret = -1;
		}
		return ret;
	}
}
