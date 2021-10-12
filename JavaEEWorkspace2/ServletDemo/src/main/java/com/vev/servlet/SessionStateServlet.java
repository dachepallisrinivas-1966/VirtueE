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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionStateServlet
 */
@WebServlet("/sessionState")
public class SessionStateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		List<String>   bag;
	    HttpSession session = request.getSession();	// acquiring the session object
	    
	    if(session.getAttribute("bag")!=null)
	        bag = (List<String>)session.getAttribute("bag");
	    else
	        bag = new ArrayList<>();
	    
	    out.println("<html><body>");
	    out.println("<form>");
	    out.println("<b>Enter a item: </b>");
	    out.println("<input type=text size=25 name='inm' />");
	    out.println("<button>Add to Cart</button>");
	    out.println("<hr />");
	    out.println("<h3> Items In The Bag: </h3>");

	    String inm = request.getParameter("inm");

	    if(inm!=null) 
	    	bag.add(inm);

	    out.println("<ol>");

	    for(String item : bag) {
	    	out.println("<li>" + item + "</li>");
	    }
	    	
	    out.println("</ol>");
	    out.println("</form>");
	    out.println("</body></html>");
	    
	    session.setAttribute("bag", bag);
	    // session.setMaxInactiveInterval(10);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
