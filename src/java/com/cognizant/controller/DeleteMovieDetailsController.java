package com.cognizant.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.model.MovieFrequencyModel;
import com.cognizant.model.MovieModel;

/**
 * Servlet implementation class DeleteMovieDetailsController
 */
public class DeleteMovieDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMovieDetailsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovieModel model=new MovieModel();
		boolean success,success1;
		MovieFrequencyModel model1=new MovieFrequencyModel();
		String MovieID=request.getParameter("Movieid");
		model.setMovieId(MovieID);
		model1.setMovieID(MovieID);
		success=model.DeleteMovieData();
		if(success)
		{
			response.sendRedirect("GetAddedMoviees.jsp?msg=Successfully deleted the Movie");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
