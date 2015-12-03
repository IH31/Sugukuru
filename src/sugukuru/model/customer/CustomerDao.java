package sugukuru.model.customer;

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

public class CustomerDao extends Dao{

	private ArrayList<Customer> customers;
	private Connection conn;
	private Statement st;
	private PreparedStatement pre;
	private ResultSet rs;
	private DateTime dt;
	private Timestamp ts;
	
	public CustomerDao() {
		conn = open();
		dt = new DateTime();
		ts = new Timestamp(dt.getMillis());
	}
	
	public ArrayList<Customer> selectAll() {
		try {
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM T_CUSTOMER");
			refill(rs);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}
	
	public ArrayList<Customer> selectCustomerId(String id) {
		try {
			pre = conn.prepareStatement("SELECT * FROM T_CUSTOMER WHERE CUSTOMER_ID=?");
			pre.setString(1, id);
			rs = pre.executeQuery();
			refill(rs);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}
	
	public String insert(Customer customer) {
		String ret = "";
		try {
			pre = conn.prepareStatement("SELECT COUNT(*) FROM T_CUSTOMER");
			rs = pre.executeQuery();
			int cnt = 0;
			
			if(rs != null) {
				rs.next();
				cnt = rs.getInt("COUNT(*)");
			}
			
			pre = conn.prepareStatement("INSERT INTO T_CUSTOMER(CUSTOMER_ID,CUSTOMER_NAME,KANA,POSTAL_CODE,ADDRESS,TELEPHONE,EMAIL,CREATED_AT) VALUES"
					+ "(?,?,?,?,?,?,?,?)");
			pre.setString(1, "cu" + (cnt + 1));
			pre.setString(2, customer.getCustomer_name());
			pre.setString(3, customer.getKana());
			pre.setString(4, customer.getPostal_code());
			pre.setString(5, customer.getAddress());
			pre.setString(6, customer.getTelephone());
			pre.setString(7, customer.getEmail());
			pre.setTimestamp(8, ts);
			pre.executeUpdate();
			ret = "cu" + (cnt + 1);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	private void refill(ResultSet rs) {
		customers = new ArrayList<>();
		try {
			while (rs.next()) {
				customers.add(new Customer(
						rs.getString("CUSTOMER_ID"),
						rs.getString("CUSTOMER_NAME"),
						rs.getString("KANA"),
						rs.getString("POSTAL_CODE"),
						rs.getString("ADDRESS"),
						rs.getString("TELEPHONE"),
						rs.getString("EMAIL"),
						rs.getString("CREATED_AT")
						));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		close(rs);
		close(st);
		close(pre);
		close(conn);
	}
}
