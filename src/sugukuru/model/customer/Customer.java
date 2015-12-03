package sugukuru.model.customer;

import sugukuru.dao.Model;

public class Customer {
	private String customer_id;
	private String customer_name;
	private String kana;
	private String postal_code;
	private String address;
	private String telephone;
	private String email;
	private String created_at;
	
	public Customer(){}

	public Customer(String customer_id, String customer_name, String kana, String postal_code, String address,
			String telephone, String email, String created_at) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.kana = kana;
		this.postal_code = postal_code;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
		this.created_at = created_at;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getKana() {
		return kana;
	}

	public void setKana(String kana) {
		this.kana = kana;
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

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
}
