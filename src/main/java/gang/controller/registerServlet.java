package gang.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import gang.user.*;

@WebServlet("/register")
public class registerServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String url = "/index.jsp";
		String action = req.getParameter("action");
		String message = "";
		if (action == null) {
			action = "register";
		}

		if (action.equals("register")) {
			String account = req.getParameter("account");
			String pass = req.getParameter("password");
			String secondpass = req.getParameter("re-password");

			User user = new User();

			if (pass.equals(secondpass)) {
				user.setAccount(account);
				user.setPassword(pass);
				System.out.println(user.getAccount());
				if (UserDAO.accountExists(user.getAccount())) {
					url = "/index.jsp";
					message = "email have already exist";

				} else {
					System.out.println(UserDAO.accountExists(user.getAccount()));
					UserDAO.addUser(user);
					message = "login";

				}
			} else {
				message = "Password does not match!!!";
				url = "/index.jsp";

			}

			req.setAttribute("message", message);

		} else if (action.equals("backtologin")) {
			url = "/index.jsp";
		}

		getServletContext().getRequestDispatcher(url).forward(req, resp);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
