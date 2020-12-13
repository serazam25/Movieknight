package com.cognizant.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.cognizant.model.MovieModel;

public class SearchMovieFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final public static Logger logger = Logger
			.getLogger(SearchMovieFormController.class);

	public SearchMovieFormController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		logger.setLevel(Level.INFO);

		ResultSet rs = null;
		MovieModel bm = new MovieModel();
		String sourceCity = request.getParameter("from");
		String destinationCity = request.getParameter("to");
		String departDate = request.getParameter("date");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d2 = new Date();
		try {
			d2 = sdf.parse(departDate);
		} catch (Exception e) {

		}
		Date d1 = new Date();

		if (d1.equals(d2) || d1.before(d2)) {

			logger.setLevel(Level.INFO);
			logger.info("Seaching for source: " + sourceCity + " destination: "
					+ destinationCity + " date: " + departDate);

			bm.setSourceCity(sourceCity);
			bm.setDepartureDate(departDate);
			bm.setDestinationCity(destinationCity);
			rs = bm.searchMovieBetweenStations();

			try {
				rs.last();
				int count = 0;
				count = rs.getRow();
				if (count <= 0) {
					String msg = "No Movie found between " + sourceCity + " and "
							+ destinationCity;
					logger.info("Search results not found!!");
					HttpSession session = request.getSession();
					if (session.getAttribute("type") == null) {
						response.sendRedirect("index.jsp?msg=" + msg);
					} else {
						response.sendRedirect("SearchMovieForm.jsp?msg=" + msg);
					}
				} else {
					rs.beforeFirst();
					RequestDispatcher disp = request
							.getRequestDispatcher("GetMovieSearchResults.jsp");
					request.setAttribute("Date", request.getParameter("date"));
					request.setAttribute("MovieInformation", rs);
					System.out.println("Search results found!!");
					disp.forward(request, response);
				}
			} catch (Exception e) {
				String msg = "No Movie found between " + sourceCity + " and "
						+ destinationCity;
				HttpSession session = request.getSession();
				System.out.println("Search results not found!! for exception");
				if (session.getAttribute("type") == null) {
					response.sendRedirect("index.jsp?msg=" + msg);
				} else {
					response.sendRedirect("SearchMovieForm.jsp?msg=" + msg);

				}

			}
		} else {
			HttpSession session = request.getSession();
			String msg = "Wrong date selection! (Present day or previous day selected)";
			if (session.getAttribute("type") == null) {
				response.sendRedirect("index.jsp?msg=" + msg);
			} else {
				response.sendRedirect("SearchMovieForm.jsp?msg=" + msg);

			}
		}
	}
}