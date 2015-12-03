package sugukuru.controller.ec.login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sugukuru.auth.Auth;
import sugukuru.validation.Validation;

/**
 * Servlet implementation class Ec_Login
 */
@WebServlet("/ec/login")
public class Ec_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ec_Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/view/ec/login/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestPage = "/WEB-INF/view/ec/login/index.jsp";
		Validation validation = new Validation(request, new String[]{"email:require","password:require","email:email"});
		try {
			if(validation.createValidation()) {
				if(Auth.loginCorporate(request)) {
					request.setAttribute("msg", new ArrayList<String>(Arrays.asList("ログインしました。")));
					requestPage = "/WEB-INF/view/ec/top.jsp";
				} else {
					request.setAttribute("errmsg", new ArrayList<String>(Arrays.asList("Email,またはPasswordが間違っています。")));
				}
			} else {
				request.setAttribute("errmsg", validation.getErrCode());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/WEB-INF/view/ec/login/index.jsp").forward(request, response);
	}

}
