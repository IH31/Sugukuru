package sugukuru.model.product;

import sugukuru.dao.Model;

/**
 *
 * @author saito.tatsuro
 *
 */
public class Product {
	private String product_id;
	private String product_name;
	private String kana;
	private int price;
	private String manufacturer;
	private int order_point;
	private String created_at;
	private String update_at;
	private int stop_flg;
	private String category_id;

	
	
	public Product() {}

	public Product(String product_id,String product_name,String kana,int price,String manufactuere,
			int orger_point,String created_at,String update_at,int stop_flg,String category_id) {

		this.product_id = product_id;
		this.product_name = product_name;
		this.kana = kana;
		this.price = price;
		this.manufacturer = manufactuere;
		this.order_point = orger_point;
		this.created_at = created_at;
		this.update_at = update_at;
		this.stop_flg = stop_flg;
		this.category_id = category_id;
	}

	//getter
	public String getProduct_id() {
		return product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public String getKana() {
		return kana;
	}
	public int getPrice() {
		return price;
	}
	public String getManufactuere() {
		return manufacturer;
	}
	public int getOrder_point() {
		return order_point;
	}
	public String getCreated_at() {
		return created_at;
	}
	public String getUpdate_at() {
		return update_at;
	}
	public int getStop_flg() {
		return stop_flg;
	}
	public String getCategory_id() {
		return category_id;
	}

	//setter
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public void setKana(String kana) {
		this.kana = kana;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setManufacturer(String manufactuere) {
		this.manufacturer = manufactuere;
	}
	public void setOrder_point(int order_point) {
		this.order_point = order_point;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}
	public void setStop_flg(int stop_flg) {
		this.stop_flg = stop_flg;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
}
