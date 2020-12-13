package com.cognizant.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.model.MovieFrequencyModel;
import com.cognizant.model.MovieModel;

/**
 * Servlet implementation class AddNewMovieController
 */
public class EditMovieDetailsFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public EditMovieDetailsFormController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// PrintWriter out=response.getWriter();
		MovieModel model = new MovieModel();
		MovieFrequencyModel model1 = new MovieFrequencyModel();
		HttpSession session = request.getSession(false);
		String MovieId = (String) session.getAttribute("Movieid");
		boolean obj1;
		String operatingDays;
		StringBuffer sb = new StringBuffer("");
		String Movietype;
		if (request.getParameter("OperatingDays1") != null) {
			sb.append(request.getParameter("OperatingDays1"));
		}
		if (request.getParameter("OperatingDays2") != null) {
			sb.append(request.getParameter("OperatingDays2"));
		}
		if (request.getParameter("OperatingDays3") != null) {
			sb.append(request.getParameter("OperatingDays3"));
		}
		if (request.getParameter("OperatingDays4") != null) {
			sb.append(request.getParameter("OperatingDays4"));
		}
		if (request.getParameter("OperatingDays5") != null) {
			sb.append(request.getParameter("OperatingDays5"));
		}
		if (request.getParameter("OperatingDays6") != null) {
			sb.append(request.getParameter("OperatingDays6"));
		}
		if (request.getParameter("OperatingDays7") != null) {
			sb.append(request.getParameter("OperatingDays7"));
		}
		Movietype = request.getParameter("Movietype1") + "-"
				+ request.getParameter("Movietype2");
		operatingDays = new String(sb);

		model.setMovieName(request.getParameter("Moviename"));
		model.setMovieType(Movietype);
		model.setSourceCity(request.getParameter("departurecity"));
		model.setDestinationCity(request.getParameter("arrivalcity"));
		model.setDepartureTime(request.getParameter("departuretime"));
		model.setTravelTime(request.getParameter("traveltime"));
		model.setCost(Float.parseFloat(request.getParameter("cost")));
		model.setTotalSeats(Integer.parseInt(request.getParameter("seats")));
		// model.setOperatorID(String.valueOf(session.getAttribute("userID")));
		model.setOperatorID("Movieoperator1");
		model.setMovieId(MovieId);
		obj1 = model.EditMovieData1();

		if (obj1) {
			model1.setMovieID(MovieId);
			model1.setFrequencyDay(operatingDays);
			model1.modifyMovieForDay();

		} else {
			PrintWriter out = response.getWriter();
			out.print("error");
		}

	}

}
