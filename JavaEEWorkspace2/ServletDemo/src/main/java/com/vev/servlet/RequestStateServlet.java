package com.vev.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestStateServlet
 */
@WebServlet("/requestState")
public class RequestStateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		List<String> bag = new ArrayList<>();
		out.println("<html><body>");
		out.println("<form>");
		out.println("<b>Enter an item: </b>");
		out.println("<input type=text size=25 name='inm' />");
		out.println("<button>Add to Cart</button>");
		out.println("<hr />");
		
		out.println("<h3> Items In The Bag: </h3>");
		String inm = request.getParameter("inm");
		
		if (inm != null)
			bag.add(inm);
		
		out.println("<ul>");

		for (String item : bag) {
			out.println("<li>" + item + "</li>");
		}

		out.println("</ul>");

		out.println("</form>");
		out.println("</body></html>");
		
	}

}
