package sugukuru.dao;
import java.util.ArrayList;

public interface DaoAPI {
	public abstract <T> ArrayList<T> select(Class<T> clazz, String sql, ArrayList<String> bind);
	public abstract <T> int update(Class<T> clazz, String sql, ArrayList<String> bind);
}
