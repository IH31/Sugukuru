package sugukuru.model.order;

public class Order {

	private String order_id;
	private String order_date;
	private String corporate_id;
	private String customer_id;
	
	public Order(String order_id, String order_date, String corporate_id, String customer_id) {
		this.order_id = order_id;
		this.order_date = order_date;
		this.corporate_id = corporate_id;
		this.customer_id = customer_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getCorporate_id() {
		return corporate_id;
	}

	public void setCorporate_id(String corporate_id) {
		this.corporate_id = corporate_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}	
}
