package sugukuru.controller.admin.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin_Customer_Add
 */
@WebServlet("/admin/customer/add")
public class Admin_Customer_Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_Customer_Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/view/admin/customer/add.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String customerName = request.getParameter("customerName");
		String customerNameKana = request.getParameter("customerNameKana");
		String departmentName = request.getParameter("departmentName");
		String contactPersonName = request.getParameter("contactPersonName");
		
		System.out.println("customerName " + customerName);
		System.out.println("customerNameKana " + customerNameKana);
		System.out.println("departmentName " + departmentName);
		System.out.println("contactPersonName " + contactPersonName);
		
		request.getRequestDispatcher("/WEB-INF/view/admin/customer/add.jsp").forward(request, response);
	}

}
