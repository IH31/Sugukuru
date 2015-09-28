package sugukuru.model.product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sugukuru.model.Dao;

/**
 *
 * @author saito.tatsuro
 *
 */
public class ProductDao extends Dao{

	private PreparedStatement prepared;
	private Statement statement;
	private ResultSet result;

	public ArrayList<Product> select(String sql,ArrayList<String> bind){

		ArrayList<Product> products = new ArrayList<Product>();

		try{
			this.open();
			prepared = this.connection.prepareStatement(sql);

			for(int idx = 0; idx < bind.size(); idx++) {
				prepared.setString(idx, bind.get(idx));
			}
			result = prepared.executeQuery();

			while(result.next()){
				products.add(new Product(
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
						));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	public ArrayList<Product> select(String sql) {

		ArrayList<Product> products = new ArrayList<Product>();

		try{
			this.open();
			statement = this.connection.createStatement();
			result = statement.executeQuery(sql);

			while(result.next()){
				products.add(new Product(
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
						));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	public int update(String sql, ArrayList<String> bind) {
		int ret = 0;
		try{
			this.open();
			prepared = this.connection.prepareStatement(sql);
			/**
			 * バインドセット
			 */
			ret = prepared.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

}
