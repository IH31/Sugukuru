package sugukuru.controller.ec.pay;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sugukuru.auth.Auth;
import sugukuru.cart.Cart;
import sugukuru.cart.CartItem;
import sugukuru.model.customer.Customer;
import sugukuru.model.customer.CustomerDao;
import sugukuru.payment.Payment;

/**
 * Servlet implementation class Ec_Pay
 */
@WebServlet({"/ec/pay/*"})
public class Ec_Pay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ec_Pay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestPage = "";
		HttpSession session = request.getSession();
		
		if(Auth.check(request)) {
			
		} else {
			if(request.getRequestURI().equals(request.getContextPath() + "/ec/pay/step1") &&
					Cart.getCartItem(session) != null) {
				requestPage = "/WEB-INF/view/ec/pay/step1.jsp";
				ArrayList<CartItem> cartItems = Cart.getCartItem(session);
				request.setAttribute("cart", cartItems);
			} else if(request.getRequestURI().equals(request.getContextPath() + "/ec/pay/step2") &&
					Cart.getCartItem(session) != null) {
				requestPage = "/WEB-INF/view/ec/pay/step2.jsp";
			}
		}
		request.getRequestDispatcher(requestPage).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestPage = "";
		HttpSession session = request.getSession(true);
		
		if(request.getRequestURI().equals(request.getContextPath() + "/ec/pay/step3")) {
			Customer customer = new Customer("",
					request.getParameter("customerName"),
					request.getParameter("kana"),
					request.getParameter("postalCode"),
					request.getParameter("address"),
					request.getParameter("telephone"),
					request.getParameter("email"), "");
			session.setAttribute("customer", customer);
			requestPage = "/WEB-INF/view/ec/pay/step3.jsp";
		} else if(request.getRequestURI().equals(request.getContextPath() + "/ec/pay/step4")) {
			Payment.paymentCustomer(request);
			requestPage = "/WEB-INF/view/ec/pay/step4.jsp";
		}
		request.getRequestDispatcher(requestPage).forward(request, response);
	}

}
