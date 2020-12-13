package com.cognizant.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.model.MovieOperatorModel;

/**
 * Servlet implementation class AddNewMovieOperatorController
 */
public class AddNewMovieOperatorFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewMovieOperatorFormController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MovieOperatorModel model=new MovieOperatorModel();
		
		model.setOpeartorName(request.getParameter("Movieoperatorname"));
		model.setEmail(request.getParameter("email"));
		model.setAddress(request.getParameter("address"));
		model.setCity(request.getParameter("city"));
		model.setPhoneNumber(request.getParameter("phonenumber"));
		
		if(request.getParameter("password").equals(request.getParameter("newpassword")))
		{
			model.setPassword(request.getParameter("password"));
			model.insertRegistrationData();
			response.sendRedirect("addnewMovieoperator.jsp?msg=Movie operator added successfully..");	
		}
		else{
			response.sendRedirect("addnewMovieoperator.jsp?msg=Password Does not match..");
		}
			
	}

}
