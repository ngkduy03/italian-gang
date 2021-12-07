package gang.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gang.pizza.Pizza;
import gang.pizza.PizzaDAO;

@WebServlet("")
public class indexControllerServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Pizza> listPizzas = new ArrayList<Pizza>();
		listPizzas = PizzaDAO.selectAllPizza();
		req.setAttribute("listPizzas", listPizzas);

		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
