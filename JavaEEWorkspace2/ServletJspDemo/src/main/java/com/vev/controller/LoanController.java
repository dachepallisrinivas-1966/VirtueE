package com.vev.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vev.model.LoanModel;
import com.vev.service.LoanService;

/**
 * Servlet implementation class LoanController
 */
@WebServlet("/loan")
public class LoanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LoanService loanService = new LoanService();

		String view = null;
		String p = request.getParameter("p");
		String t = request.getParameter("t");
		String r = request.getParameter("r");
		if (p == null || t == null || r == null) {
			view = "loan-input.jsp";
		} else {
			LoanModel loanModel = new LoanModel();
			loanModel.setPrinciple(Double.parseDouble(p));
			loanModel.setTimePeriod(Double.parseDouble(t));
			loanModel.setRateOfInterest(Double.parseDouble(r));

			loanService.computeInterest(loanModel);
			loanService.computePayableAmount(loanModel);

			request.setAttribute("loanModel", loanModel);
			view = "loan-output.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
