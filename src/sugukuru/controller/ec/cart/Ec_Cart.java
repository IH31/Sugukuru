package sugukuru.controller.ec.cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import sugukuru.model.product.Product;
import sugukuru.model.product.ProductDao;
import sugukuru.cart.*;

/**
 * Servlet implementation class Ec_Cart
 */
@WebServlet("/ec/cart")
public class Ec_Cart<T> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ec_Cart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param <T>
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestPage = "/WEB-INF/view/ec/cart/index.jsp";
		String cartDelId = request.getParameter("cartDelId");
		HttpSession session = request.getSession(true);
		
		if(StringUtils.contains(cartDelId, "p")) {
			Product product = new Product();
			product.setProduct_id(cartDelId);
			Cart.delCartItem(session, new CartItem(product, 1));
		}
		
		ArrayList<CartItem> cartItems = Cart.getCartItem(session);
		request.setAttribute("cart", cartItems);
		request.getRequestDispatcher(requestPage).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
