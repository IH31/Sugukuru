package sugukuru.model.product;

import java.util.ArrayList;

public class ProductDaoHelper {

	public ArrayList<Product> getProductsAll() {

		ArrayList<Product> products = new ArrayList<Product>();
		ProductDao dao = new ProductDao();
		String sql = "SELECT * FROM T_PRODUCT;";

		products = dao.select(sql);

		return products;
	}

	public ArrayList<Product> getProductsWhere(ArrayList<String> column, ArrayList<String> where) {
		ArrayList<Product> products = new ArrayList<Product>();
		ProductDao dao = new ProductDao();
		String sql = "SELECT * FROM T_PRODUCT WHERE ";

		for(int idx = 0; idx < column.size() - 1; idx++) {
			sql += column.get(idx) + "=? and ";
		}
		sql += column.get(column.size() - 1) + "=?";
		sql += ";";

		products = dao.select(sql, where);

		return products;
	}
}
