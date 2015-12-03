package sugukuru.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import sugukuru.model.corporate.Corporate;
import sugukuru.model.corporate.CorporateDao;

public class Auth {
	
	private static HttpSession session;

	public static boolean loginCorporate(HttpServletRequest request) {
		CorporateDao corporateDao = new CorporateDao();
		Corporate corporate = corporateDao.selectEmailAndPassword(request.getParameter("email"),
				request.getParameter("password"));
		if(corporate != null){
			session = request.getSession(true);
			session.setAttribute("login", corporate);
			corporateDao.closeAll();
			return true;
		} else {
			corporateDao.closeAll();
			return false;
		}
	}
	
	public static boolean check(HttpServletRequest request) {
		session = request.getSession();
		if(session.getAttribute("login") != null) {
			return true;
		} else {
			return false;
		}
	}
}
