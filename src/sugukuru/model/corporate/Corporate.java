package sugukuru.model.corporate;

public class Corporate {

	private String coporate_id;
	private String corporate_name;
	private String kana;
	private String department_name;
	private String contact_person_name;
	private String postal_code;
	private String address;
	private String telephone;
	private String email;
	private String password;
	private String pay_date;
	private int discount_rate;
	private int credit_limit;
	private String start_date;
	private String finish_date;
	private int account;
	private String created_at;
	
	public Corporate() {}
	
	public Corporate(String coporate_id, String corporate_name, String kana, String department_name,
			String contact_person_name, String postal_code, String address, String telephone, String email,
			String password, String pay_date, int discount_rate, int credit_limit, String start_date,
			String finish_date, int account, String created_at) {
		this.coporate_id = coporate_id;
		this.corporate_name = corporate_name;
		this.kana = kana;
		this.department_name = department_name;
		this.contact_person_name = contact_person_name;
		this.postal_code = postal_code;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
		this.password = password;
		this.pay_date = pay_date;
		this.discount_rate = discount_rate;
		this.credit_limit = credit_limit;
		this.start_date = start_date;
		this.finish_date = finish_date;
		this.account = account;
		this.created_at = created_at;
	}

	public String getCoporate_id() {
		return coporate_id;
	}

	public void setCoporate_id(String coporate_id) {
		this.coporate_id = coporate_id;
	}

	public String getCorporate_name() {
		return corporate_name;
	}

	public void setCorporate_name(String corporate_name) {
		this.corporate_name = corporate_name;
	}

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getContact_person_name() {
		return contact_person_name;
	}

	public void setContact_person_name(String contact_person_name) {
		this.contact_person_name = contact_person_name;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPay_date() {
		return pay_date;
	}

	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}

	public int getDiscount_rate() {
		return discount_rate;
	}

	public void setDiscount_rate(int discount_rate) {
		this.discount_rate = discount_rate;
	}

	public int getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getFinish_date() {
		return finish_date;
	}

	public void setFinish_date(String finish_date) {
		this.finish_date = finish_date;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
}
