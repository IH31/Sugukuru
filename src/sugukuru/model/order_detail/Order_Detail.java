package sugukuru.model.order_detail;

public class Order_Detail {

	private String order_detail_id;
	private int price;
	private int num;
	private String order_id;
	private String product_id;
	
	public Order_Detail(String order_detail_id, int price, int num, String order_id, String product_id) {
		this.order_detail_id = order_detail_id;
		this.price = price;
		this.num = num;
		this.order_id = order_id;
		this.product_id = product_id;
	}

	public String getOrder_detail_id() {
		return order_detail_id;
	}

	public void setOrder_detail_id(String order_detail_id) {
		this.order_detail_id = order_detail_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
}
