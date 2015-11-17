package sugukuru.model.product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sugukuru.dao.sample;

public class ProductDao extends sample {
	
	private Statement state;
	private PreparedStatement prepare;
	private ResultSet result;
	
	public ProductDao() throws ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Product> selectAll() {
		ArrayList<Product> list = new ArrayList<Product>();
		String sql = "SELECT * FROM T_PRODUCT";
		try {
			state = this.getConnection().createStatement();
			result = state.executeQuery(sql);
			list = refill(list, result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private ArrayList<Product> refill(ArrayList<Product> list, ResultSet result) throws SQLException {
		while(result.next()) {
			list.add(
					new Product(
						result.getString("PRODUCT_ID"),
						result.getString("PRODUCT_NAME"),
						result.getString("KANA"),
						result.getInt("PRICE"),
						result.getString("MANUFACTURER"),
						result.getInt("ORDER_POINT"),
						result.getString("CREATED_AT"),
						result.getString("UPDATED_AT"),
						result.getInt("STOP_FLG"),
						result.getString("CATEGORY_ID")
						)
					);
		}
		return list;
	}
}
