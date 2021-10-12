package com.vev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServlet
 */
@WebServlet(urlPatterns = {"/config" }, initParams = { 
		@WebInitParam(name = "company", value = "Virtue E Varsity"), 
		@WebInitParam(name = "location", value = "Delhi", description = "location in india")
})
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String company = null;
	String location = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		company = config.getInitParameter("company");
		location = config.getInitParameter("location");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<p>Company : " + company + "</p>");
		out.println("<p>Location : " + location + "</p>");
	}

}
