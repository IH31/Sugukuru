package sugukuru.controller.ec.detail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import sugukuru.model.product.Product;

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
		String requestPage = "/WEB-INF/view/ec/product/detail.jsp";
		
		String id = request.getParameter("id");
		Product product = new Product();
		if(StringUtils.contains(id, "p")) {
			ArrayList<T> products = product.selectWhere("PRODUCT_ID", new ArrayList<String>(Arrays.asList(id)));
			if(products != null) {
				product = (Product)products.get(0);
				request.setAttribute("product", product);
			}
		}
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
