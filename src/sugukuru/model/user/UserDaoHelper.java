package sugukuru.model.user;

import java.util.ArrayList;

public class UserDaoHelper {

	public ArrayList<User> getUsersWhere(ArrayList<String> column, ArrayList<String> where) {
		
		ArrayList<User> users = new ArrayList<User>();
		UserDao dao = new UserDao();
		String sql = "select ";
		
		for(int idx = 0; idx < column.size() - 1; idx++) {
			sql += column.get(idx) + ", ";
		}
		sql += column.get(column.size() - 1);
		sql += "from user where ";
		
		for(int idx = 0; idx < where.size() - 1; idx++) {
			sql += where.get(idx) + "=? and ";
		}
		sql += where.get(where.size() - 1);
		sql += ";";
		
		users = dao.select(sql);
		
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
