package com.cognizant.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.helper.returnClass;
import com.cognizant.model.BookingModel;
import com.cognizant.model.MovieFrequencyModel;
import com.cognizant.model.MovieModel;
import com.cognizant.model.SeatAllocationModel;
import com.sun.org.apache.xpath.internal.operations.Bool;


public class AddNewMovieFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public AddNewMovieFormController() {
		super();
		
	}

	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// PrintWriter out=response.getWriter();
		MovieModel model = new MovieModel();
		MovieFrequencyModel model1 = new MovieFrequencyModel();
		HttpSession session = request.getSession();
		returnClass obj = new returnClass();
		boolean obj1;
		String operatingDays;
		StringBuffer sb = new StringBuffer("");
		String Movietype;
		Boolean b = false;
		if (request.getParameter("OperatingDays1") != null) {
			sb.append(request.getParameter("OperatingDays1"));
			b=true;
		}
		if (request.getParameter("OperatingDays2") != null) {
			sb.append(request.getParameter("OperatingDays2"));
			b=true;
		}
		if (request.getParameter("OperatingDays3") != null) {
			sb.append(request.getParameter("OperatingDays3"));
			b=true;
		}
		if (request.getParameter("OperatingDays4") != null) {
			sb.append(request.getParameter("OperatingDays4"));
			b=true;
		}
		if (request.getParameter("OperatingDays5") != null) {
			sb.append(request.getParameter("OperatingDays5"));
			b=true;
		}
		if (request.getParameter("OperatingDays6") != null) {
			sb.append(request.getParameter("OperatingDays6"));
			b=true;
		}
		if (request.getParameter("OperatingDays7") != null) {
			sb.append(request.getParameter("OperatingDays7"));
			b=true;
		}
		
		if(!b){
			response.sendRedirect("AddNewMovie.jsp?msg=Please select atleast one day");
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
		try{
			model.setCost(Float.parseFloat(request.getParameter("cost")));
			model.setTotalSeats(Integer.parseInt(request.getParameter("seats")));
		}
		catch(Exception e){
			response.sendRedirect("AddNewMovie.jsp?msg=Expected numeric values");
		}
		model.setOperatorID(String.valueOf(session.getAttribute("userid")));
		String departureDate = request.getParameter("");
		model.setDepartureDate(departureDate );

		obj = model.InsertMovieData();

		if (!obj.getS().equals("")) {
			model1.setMovieID(obj.getS());
			model1.setFrequencyDay(operatingDays);

			try {
				obj1 = model1.addMovieForDay();
				// System.out.println(obj1);
				if (obj1) {
					response.sendRedirect("index_committee_member.jsp?msg=Movie Added Successfully");
				} else {

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			PrintWriter out = response.getWriter();
			out.print("error");
		}

	}

}
