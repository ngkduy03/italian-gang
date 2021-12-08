package gang.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import gang.user.*;

@WebServlet(urlPatterns = "/login")
public class loginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String url = "/";
		String action = req.getParameter("action");
		String message = "";
		if (action == null) {
			action = "join";
		}
		if (action.equals("join")) {
			String account = req.getParameter("account");
			String pass = req.getParameter("password");
			User user = new User();
			user.setAccount(account);
			user.setPassword(pass);
			System.out.println(account);
			System.out.println(pass);

			if (UserDAO.accountExists(user.getAccount())) {
				if (UserDAO.checkLoginUser(account, pass)) {
					user = UserDAO.selectUser(account);

					HttpSession session = req.getSession();
					session.setAttribute("user", user);
					session.setMaxInactiveInterval(-1);
				}
			}

			req.setAttribute("message", message);
		}

		getServletContext().getRequestDispatcher(url).forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
