package sugukuru.cart;

import sugukuru.model.product.*;

public class CartItem {

	private Product product;
	private int num;
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof CartItem) {
			return getProduct().getProduct_id().equals(((CartItem)obj).getProduct().getProduct_id());
		}
		return false;
	}
	
	public CartItem(Product product, int num) {
		super();
		this.product = product;
		this.num = num;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
