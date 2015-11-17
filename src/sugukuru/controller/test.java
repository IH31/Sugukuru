package sugukuru.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sugukuru.model.product.Product;
import sugukuru.model.product.ProductDao;

/**
 * Servlet implementation class test
 */
@WebServlet({"/test", "/more"})
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.getRequestDispatcher("/WEB-INF/view/admin/login.jsp").forward(request, response);

		ArrayList<Product> list = null;
		try {
			ProductDao dao = new ProductDao();
			list = dao.selectAll();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!list.isEmpty()) {
			System.out.println("ID :" + list.get(0).getProduct_id());
		} else {
			System.out.println("nasi");
		}
		
		request.getRequestDispatcher("/WEB-INF/view/ec/product/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/view/ec/product/index.jsp").forward(request, response);
	}

}
