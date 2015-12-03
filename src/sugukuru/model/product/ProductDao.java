package sugukuru.model.product;

import sugukuru.dao2.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

public class ProductDao extends Dao {
	
	private ArrayList<Product> products;
	private Connection conn;
	private Statement st;
	private PreparedStatement pre;
	private ResultSet rs;
	private DateTime dt;
	
	public ProductDao() {
		conn = open();
		dt = new DateTime();
	}

	public ArrayList<Product> selectAll() {
		try {
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM T_PRODUCT");
			refill(rs);
		} catch(SQLException e) { 
			e.printStackTrace();
		}
		return products;
	}
	
	public ArrayList<Product> selectProductId(String id) {
		try {
			pre = conn.prepareStatement("SELECT * FROM T_PRODUCT WHERE PRODUCT_ID=?");
			pre.setString(1, id);
			rs = pre.executeQuery();
			refill(rs);
		} catch(SQLException e) { 
			e.printStackTrace();
		}
		return products;
	}
	
	public int insert(Product p) {
		int ret = 0;
		try {
			pre = conn.prepareStatement("SELECT COUNT(*) FROM T_PRODUCT");
			rs = pre.executeQuery();
			int cnt = 0;
			
			if(rs != null) {
				rs.next();
				cnt = rs.getInt("COUNT(*)");
			}
			
			pre = conn.prepareStatement("INSERT INTO T_PRODUCT(PRODUCT_ID,PRODUCT_NAME,KANA,"
					+ "PRICE,MANUFACTURER,ORDER_POINT,CREATED_AT,UPDATED_AT,STOP_FLG,CATEGORY_ID) VALUES"
					+ "(?,?,?,?,?,?,?,?,?,?)");
			pre.setString(1, "p" + (cnt + 1));
			pre.setString(2, p.getProduct_name());
			pre.setString(3, p.getKana());
			pre.setInt(4, p.getPrice());
			pre.setString(5, p.getManufacturer());
			pre.setInt(6, p.getOrder_point());
			pre.setString(7, dt.toString(ISODateTimeFormat.dateTime()));
			pre.setString(8, p.getUpdated_at());
			pre.setInt(9, p.getStop_flg());
			pre.setString(10, p.getCategory_id());
			ret = pre.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public ArrayList<Product> selectCategoryId(String id) {
		try {
			pre = conn.prepareStatement("SELECT * FROM T_PRODUCT WHERE CATEGORY_ID=?");
			pre.setString(1, id);
			rs = pre.executeQuery();
			refill(rs);
		} catch(SQLException e) { 
			e.printStackTrace();
		}
		return products;
	}
	
	private void refill(ResultSet result) {
		this.products = new ArrayList<>();
		try {
			while(result.next()) {
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
						)
				);
			}
		} catch(SQLException e) { e.printStackTrace(); }
	}

	@Override
	public void closeAll() {
		close(rs);
		close(pre);
		close(st);
		close(conn);
	}
}
