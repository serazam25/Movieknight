package com.cognizant.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.model.MovieOperatorModel;

/**
 * Servlet implementation class DeleteMovieOperatorByAdminController
 */
public class DeleteMovieOperatorByAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMovieOperatorByAdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovieOperatorModel model=new MovieOperatorModel();
		String operatorID=request.getParameter("operatorid");
		model.setOperatorID(operatorID);
		model.deleteOperatorAccountFromAdmin();
		response.sendRedirect("DeleteMovieOperatorByAdmin.jsp?msg=operator deleted successfully");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
