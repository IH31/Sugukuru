package sugukuru.dao;

import java.lang.reflect.Method;
import java.util.ArrayList;

public abstract class Model {

	protected abstract String getPrimaryKeyVal();
	protected abstract String getPrimaryKey();
	protected abstract Class<?> getClazz();
	protected abstract String getTableName();
	
	private DaoAPI getDaoAPI() {
		DaoAPI dao = new Dao();
		return dao;
	}
	
	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> selectAll() {
		String sql = "SELECT * FROM " + getTableName();
		return (ArrayList<T>) this.getDaoAPI().select(getClazz(), sql, null);
	}
	
	@SuppressWarnings("unchecked")
	public <T> ArrayList<T> selectWhere(String where, ArrayList<String> whereArgs) {
		String sql = "SELECT * FROM " + getTableName() + " WHERE " + where + "=?";
		return (ArrayList<T>) this.getDaoAPI().select(getClazz(), sql, whereArgs);
	}
	
	public int update(ArrayList<String> colmuns, ArrayList<String> values) {
		String sql = "UPDATE " + getTableName() + " SET ";
		for(String col : colmuns) {
			sql += col + "=? ";
		}
		sql += "WHERE " + getPrimaryKey() + "=" + getPrimaryKeyVal();
		return this.getDaoAPI().update(getClazz(), sql, values);
	}
	/*
	public int insert() {
		Method[] methods = getClazz().getMethods();
		String sql = "INSERT INTO " + getTableName() + " VALUES(";
		for(int idx = 0; idx < methods.length / 2; idx++) {
			sql += "?,";
		}
		sql.substring(0,sql.lastIndexOf(","));
		sql += ")";
		
	}*/
}
