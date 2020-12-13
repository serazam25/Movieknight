package com.cognizant.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.cognizant.model.BookingModel;
import java.util.List;

/**
 * Servlet implementation class GetBookingInformationController
 */
public class GetBookingInformationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetBookingInformationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
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
		String booking = request.getParameter("booking");
		String Movieid = request.getParameter("MovieId");
                ResultSet rs = null;
		BookingModel bm = new BookingModel();
		bm.setBookingID(booking);
		HttpSession session = request.getSession();
		bm.setUserID(session.getAttribute("userid").toString());
		rs = bm.getBookingInfo("user", "na");
                
                
		String type = request.getParameter("chabed");
                if(type.equalsIgnoreCase("chabed")){
                    System.out.println("woirkg chabed");
                    String userId = session.getAttribute("userid").toString();
                    System.out.println(userId);
                    System.out.println(booking);
                    System.out.println(Movieid);
                    
                    List<String> li = bm.getSeatTotalAndSeatPrice();
                    if(li.size()>0){
                        response.sendRedirect("PaymentConfirm.jsp?a="+"attribute&email="+userId+"&noOfseats="+li.get(0)+"&ticketPrice="+li.get(1)+"&Movieid="+Movieid);
                    
                    }else{
                        response.sendRedirect("UserPaymentSearch.jsp?msg="+"You select wrong booking Id");
                    
                    }
                    return;
                    
                }
                
		
		try {
			if (!rs.next()) {
				response.sendRedirect("GetBookingInformation.jsp?msg=No such booking");
			}
			else{
				rs.beforeFirst();
				RequestDispatcher rd = request.getRequestDispatcher("PrintTicket.jsp");
				request.setAttribute("ticket", rs);
				rd.forward(request, response);
			}
		} catch (SQLException e) {

		}
		
	}

}
