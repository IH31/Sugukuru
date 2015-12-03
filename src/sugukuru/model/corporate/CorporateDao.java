package sugukuru.model.corporate;

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

public class CorporateDao extends Dao{
	
	private ArrayList<Corporate> corporates;
	private Connection conn;
	private Statement st;
	private PreparedStatement pre;
	private ResultSet rs;
	private DateTime dt;
	private Timestamp ts;
	
	public CorporateDao() {
		conn = open();
		dt = new DateTime();
		ts = new Timestamp(dt.getMillis());
	}
	
	public ArrayList<Corporate> selectAll() {
		try {
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM T_CORPORATE");
			refill(rs);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return corporates;
	}
	
	public Corporate selectEmailAndPassword(String email, String password) {
		Corporate corporate = null;
		try {
			pre = conn.prepareStatement("SELECT * FROM T_CORPORATE WHERE EMAIL=? AND PASSWORD=?");
			pre.setString(1, email);
			pre.setString(2, password);
			rs = pre.executeQuery();
			refill(rs);
			if(corporates != null && !corporates.isEmpty())
				corporate = corporates.get(0);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return corporate;
	}
	
	public int insert(Corporate corporate) {
		int ret = 0;
		try {
			pre = conn.prepareStatement("SELECT COUNT(*) FROM T_CORPORATE");
			rs = pre.executeQuery();
			int cnt = 0;
			if(rs != null) {
				rs.next();
				cnt = rs.getInt("COUNT(*)");
			}
			
			pre = conn.prepareStatement("INSERT INTO T_CORPORATE(CORPORATE_ID,CORPORATE_NAME,KANA,DEPARTMENT_NAME,"
					+ "CONTACT_PERSON_NAME,POSTAL_CODE,ADDRESS,TELEPHONE,EMAIL,PASSWORD,PAYDATE,DISCOUNT_RATE,"
					+ "CREDIT_LIMIT,START_DATE,FINISH_DATE,ACCOUNT,CREATED_AT) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pre.setString(1, "co" + (cnt + 1));
			pre.setString(2, corporate.getCorporate_name());
			pre.setString(3, corporate.getKana());
			pre.setString(4, corporate.getDepartment_name());
			pre.setString(5, corporate.getContact_person_name());
			pre.setString(6, corporate.getPostal_code());
			pre.setString(7, corporate.getAddress());
			pre.setString(8, corporate.getTelephone());
			pre.setString(9, corporate.getEmail());
			pre.setString(10, corporate.getPassword());
			pre.setString(11, corporate.getPay_date());
			pre.setInt(12, corporate.getDiscount_rate());
			pre.setInt(13, corporate.getCredit_limit());
			pre.setString(14, corporate.getStart_date());
			pre.setString(15, corporate.getFinish_date());
			pre.setInt(16, corporate.getAccount());
			pre.setTimestamp(17, ts);
			ret = pre.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return ret;
	}
	
	private void refill(ResultSet rs) {
		corporates = new ArrayList<>();
		try {
			while (rs.next()) {
				corporates.add(new Corporate(
						rs.getString("CORPORATE_ID"),
						rs.getString("CORPORATE_NAME"),
						rs.getString("KANA"),
						rs.getString("DEPARTMENT_NAME"),
						rs.getString("CONTACT_PERSON_NAME"),
						rs.getString("POSTAL_CODE"),
						rs.getString("ADDRESS"),
						rs.getString("TELEPHONE"),
						rs.getString("EMAIL"),
						rs.getString("PASSWORD"),
						rs.getString("PAYDATE"),
						rs.getInt("DISCOUNT_RATE"),
						rs.getInt("CREDIT_LIMIT"),
						rs.getString("START_DATE"),
						rs.getString("FINISH_DATE"),
						rs.getInt("ACCOUNT"),
						rs.getString("CREATED_AT")
						));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void closeAll() {
		close(rs);
		close(pre);
		close(st);
		close(conn);
	}
}
