package sugukuru.controller.ec;

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
 * Servlet implementation class Ec
 */
@WebServlet({"/ec", "/ec/products"})
public class Ec extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ec() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String requestPage = "/WEB-INF/view/ec/product/index.jsp";
		String id = request.getParameter("id");
		
		Product product = new Product();
		if(StringUtils.contains(id, "ca")) {
			request.setAttribute("products", product.selectWhere("CATEGORY_ID", new ArrayList<String>(Arrays.asList(id))));
		} else {
			request.setAttribute("products", product.selectAll());
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
