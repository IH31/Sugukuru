package sugukuru.model.order_detail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sugukuru.dao2.Dao;
import sugukuru.model.order.Order;

public class Order_DetailDao extends Dao {

	private ArrayList<Order_Detail> order_details;
	private Connection conn;
	private Statement st;
	private PreparedStatement pre;
	private ResultSet rs;
	
	public Order_DetailDao() {
		conn = open();
	}
	
	public int insert(Order_Detail order_detail) {
		int ret = 0;
		try {
			pre = conn.prepareStatement("SELECT COUNT(*) FROM T_ORDER_DETAIL");
			rs = pre.executeQuery();
			int cnt = 0;
			
			if(rs != null) {
				rs.next();
				cnt = rs.getInt("COUNT(*)");
			}
			pre = conn.prepareStatement("INSERT INTO T_ORDER_DETAIL(ORDER_DETAIL_ID,PRICE,NUM,ORDER_ID,PRODUCT_ID) VALUES(?,?,?,?,?)");
			pre.setString(1, "od" + (cnt + 1));
			pre.setInt(2, order_detail.getPrice());
			pre.setInt(3, order_detail.getNum());
			pre.setString(4, order_detail.getOrder_id());
			pre.setString(5, order_detail.getProduct_id());
			ret = pre.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		close(rs);
		close(pre);
		close(st);
		close(conn);
	}
}
