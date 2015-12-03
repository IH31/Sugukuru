package sugukuru.model.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import sugukuru.dao2.Dao;

public class OrderDao extends Dao{

	private ArrayList<Order> orders;
	private Connection conn;
	private Statement st;
	private PreparedStatement pre;
	private ResultSet rs;
	private DateTime dt;
	private Timestamp ts;
	
	public OrderDao() {
		conn = open();
		dt = new DateTime();
		ts = new Timestamp(dt.getMillis());
	}
	
	public String insert(Order order) {
		String ret = "";
		try {
			pre = conn.prepareStatement("SELECT COUNT(*) FROM T_ORDER");
			rs = pre.executeQuery();
			int cnt = 0;
			
			if(rs != null) {
				rs.next();
				cnt = rs.getInt("COUNT(*)");
			}
			pre = conn.prepareStatement("INSERT INTO T_ORDER(ORDER_ID,ORDER_DATE,CORPORATE_ID,CUSTOMER_ID) VALUES(?,?,?,?)");
			pre.setString(1, "o" + (cnt + 1));
			pre.setTimestamp(2, ts);
			pre.setString(3, order.getCorporate_id());
			pre.setString(4, order.getCustomer_id());
			pre.executeUpdate();
			ret = "o" + (cnt + 1);
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
