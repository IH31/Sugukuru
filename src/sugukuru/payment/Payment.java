package sugukuru.payment;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import sugukuru.cart.Cart;
import sugukuru.cart.CartItem;
import sugukuru.model.customer.Customer;
import sugukuru.model.customer.CustomerDao;
import sugukuru.model.order.Order;
import sugukuru.model.order.OrderDao;
import sugukuru.model.order_detail.Order_Detail;
import sugukuru.model.order_detail.Order_DetailDao;

public class Payment {

	public static void paymentCustomer(HttpServletRequest request) {
		HttpSession session = request.getSession();
		ArrayList<CartItem> cartItems = Cart.getCartItem(session);
		
		Customer customer = (Customer)session.getAttribute("customer");
		CustomerDao customerDao = new CustomerDao();
		String customer_id = customerDao.insert(customer);
		customerDao.closeAll();
		
		OrderDao orderDao = new OrderDao();
		String order_id = orderDao.insert(new Order("", "", "", customer_id));
		orderDao.closeAll();
		
		Order_DetailDao order_detailDao = new Order_DetailDao();
		for(CartItem cartItem : cartItems) {
			order_detailDao.insert(new Order_Detail("", 
					cartItem.getProduct().getPrice() * cartItem.getNum(),
					cartItem.getNum(),
					order_id,
					cartItem.getProduct().getProduct_id()));
		}
		order_detailDao.closeAll();
		session.invalidate();
	}
}
