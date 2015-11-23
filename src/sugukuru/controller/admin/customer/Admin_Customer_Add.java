package sugukuru.controller.admin.customer;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sugukuru.validation.Validation;

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
		
		
		
		Validation valid =
				new Validation(request,
						new String[]{"customerName:number","email:email"});
		
		try {
			if(valid.createValidation()) {
				System.out.println("valid OK!");
			} else {
				System.out.println("valid NG...");
			}
			ArrayList<String> arr = valid.getErrCode();
			for(String a : arr) {
				System.out.println(a);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher("/WEB-INF/view/admin/customer/add.jsp").forward(request, response);
	}

}
