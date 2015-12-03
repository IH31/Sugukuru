package sugukuru.controller.ec.detail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import sugukuru.cart.Cart;
import sugukuru.cart.CartItem;
import sugukuru.model.product.Product;
import sugukuru.model.product.ProductDao;

/**
 * Servlet implementation class Ec_Detail
 * @param <T>
 */
@WebServlet("/ec/detail")
public class Ec_Detail<T> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ec_Detail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		String requestPage = "/WEB-INF/view/ec/product/detail.jsp";
		String id = request.getParameter("id");
		String cartAddId = request.getParameter("cartAddId");
		String cartAddNum = request.getParameter("cartAddNum");
		
		Product product = new Product();
		ProductDao productDao = new ProductDao();
		
		if(StringUtils.contains(id, "p")) {
			ArrayList<Product> products = productDao.selectProductId(id);
			if(products != null && products.size() > 0) {
				product = (Product)products.get(0);
				request.setAttribute("product", product);
			}
		} else if(StringUtils.contains(cartAddId, "p") && StringUtils.isNumeric(cartAddNum)) {
			ArrayList<Product> products = productDao.selectProductId(cartAddId);
			if(products != null && products.size() > 0) {
				product = (Product)products.get(0);
				Cart.addCartItem(session, new CartItem(product, Integer.parseInt(cartAddNum)));
				request.setAttribute("product", product);
			}
		}
		productDao.closeAll();
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
