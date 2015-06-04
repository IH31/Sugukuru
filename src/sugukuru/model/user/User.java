package sugukuru.model.user;

/**
 * @author yuta
 * @since 2015/06/02
 * Model User
 */
public class User {

	private String id;
	private String password;
	private String customer_name;
	private String address;
	private int phone;
	private int fax;
	private String email;
	
	public User(String id, String password, String customer_name,
			String address, int phone, int fax, String email) {
		
		this.id = id;
		this.password = password;
		this.customer_name = customer_name;
		this.address = address;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
