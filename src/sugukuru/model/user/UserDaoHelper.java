package sugukuru.model.user;

import java.util.ArrayList;

public class UserDaoHelper {

	public ArrayList<User> getUsersAll() {
		
		ArrayList<User> users = new ArrayList<User>();
		UserDao dao = new UserDao();
		String sql = "select * from user;";
		
		users = dao.select(sql);
		
		return users;
	}
	
	public ArrayList<User> getUsersWhere(ArrayList<String> column, ArrayList<String> where) {
		
		ArrayList<User> users = new ArrayList<User>();
		UserDao dao = new UserDao();
		String sql = "select * ";
		
		sql += "from user where ";
		
		for(int idx = 0; idx < column.size() - 1; idx++) {
			sql += column.get(idx) + "=? and ";
		}
		sql += column.get(column.size() - 1);
		sql += ";";
		
		users = dao.select(sql, where);
		
		return users;
	}
	
//	public ArrayList<User> getUsers(String where) {
//		
//	}
//		
//	public User getUser(String where, ArrayList<string> array) {
//		
//	}
}
