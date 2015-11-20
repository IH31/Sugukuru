package sugukuru.dao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Dao implements DaoAPI {

	private Connection conn;
	private Statement state;
	private PreparedStatement prepare;
	private ResultSet result;
	
	final private String serverName = "192.168.33.12";
	final private String instanceName = "XE";
	final private String userName = "ih13";
	final private String password = "ih13";
	
	public Dao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + serverName +
					":1521:" + instanceName, userName, password);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> ArrayList<T> select(Class<T> clazz, String sql, ArrayList<String> bind) {
		
		ArrayList<T> array = new ArrayList<T>();
		Constructor<T> constructor;
		Method[] methods = clazz.getMethods();
		Object obj;
		
		try {
			constructor = clazz.getConstructor(new Class[]{});
			prepare = conn.prepareStatement(sql);
			if(bind != null && bind.size() > 0) {
				for(int idx = 0; idx < bind.size(); idx++) {
					prepare.setString(idx + 1, bind.get(idx));
				}
			}
			System.out.println(sql);
			result = prepare.executeQuery();
			while(result.next()) {
				obj = constructor.newInstance(new Object[] {});
				for(Method method : methods) {
					if(method.getName().startsWith("set")) {
						Class<?>[] arg = method.getParameterTypes();
						if(arg[0].getName() == "java.lang.String") {
							System.out.println(method.getName().substring(3).toUpperCase());
							method.invoke(obj, result.getString(method.getName().substring(3).toUpperCase()));
						} else if(arg[0].getName() == "int") {
							System.out.println(method.getName().substring(3).toUpperCase());
							method.invoke(obj, result.getInt(method.getName().substring(3).toUpperCase()));
						}
					}
				}
				array.add((T) obj);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
		return array;
	}
	
	@Override
	public <T> int update(Class<T> clazz, String sql, ArrayList<String> bind) {
		int ret = 0;
		try {
			prepare = conn.prepareStatement(sql);
			if(bind != null && bind.size() > 0) {
				for(int idx = 0; idx < bind.size(); idx++) {
					prepare.setString(idx + 1, bind.get(idx));
				}
			}
			ret = prepare.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
			ret = -1;
		} finally {
			this.close();
		}
		return ret;
	}
	
	private void close() {
		try {
			if(result != null) { result.close(); }
			if(state != null) { state.close(); }
			if(prepare != null) { prepare.close(); }
			if(conn != null) { conn.close(); }
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
