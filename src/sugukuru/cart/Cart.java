package sugukuru.cart;

import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import sugukuru.model.product.Product;

public class Cart {
	
	private static ArrayList<CartItem> cartItems;

	public static void addCartItem(HttpSession session, CartItem cartItem) {
		clearArr();
		cartItems = (ArrayList<CartItem>)session.getAttribute("cart");
		if(cartItems == null) {
			cartItems = new ArrayList<CartItem>();
		}
		int idx = cartItems.indexOf(cartItem);
		if(idx >= 0) {
			cartItems.get(idx).setNum(cartItems.get(idx).getNum() + 1);
		} else {
			cartItems.add(cartItem);
		}
		session.setAttribute("cart", cartItems);
	}
	
	public static ArrayList<CartItem> getCartItem(HttpSession session) {
		clearArr();
		cartItems = (ArrayList<CartItem>)session.getAttribute("cart");
		return cartItems;
	}
	
	public static void delCartItem(HttpSession session, CartItem cartItem) {
		clearArr();
		cartItems = (ArrayList<CartItem>)session.getAttribute("cart");
		int idx = cartItems.indexOf(cartItem);
		if(idx >= 0) {
			cartItems.remove(idx);
		}
		session.setAttribute("cart", cartItems);
	}
	
	private static void clearArr() {
		cartItems = null;
	}
}
