package com.cognizant.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.model.MovieModel;
import com.cognizant.model.MovieOperatorModel;
import com.cognizant.model.PaymentModel;
import com.cognizant.model.UserModel;

/**
 * Servlet implementation class DeleteMovieOperatorController
 */
public class DeleteMovieOperatorFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMovieOperatorFormController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phoneNumber=request.getParameter("phonenumber");
		String passWord=request.getParameter("password");
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession();
		String eMail=String.valueOf(session.getAttribute("email"));

		MovieOperatorModel model=new MovieOperatorModel();
		MovieModel model1=new MovieModel();
		PaymentModel model2=new PaymentModel();
		ResultSet rs=null;
		ResultSet rs1=null;
		model.setEmail(eMail);
		model.setPassword(passWord);
		
		try{
			Integer.parseInt(phoneNumber);
		}
		catch(Exception e){
			response.sendRedirect("DeleteMovieOperator.jsp?msg=expected numeric value");
		}
		
		
		try
		{
		rs=model.selectLoginData1();
		
		if(!rs.next()){
			response.sendRedirect("DeleteMovieOperator.jsp?msg=Invalid details");
		}
		else{
			rs.beforeFirst();
		while(rs.next())
		{
			String MovieoperatorId=rs.getString(1);
			model2.setOperatorID(MovieoperatorId);
			if(rs.getString(6).equals(phoneNumber))
			{
				
				boolean result=model.deleteOperatorAccount();
				System.out.println("Result:"+result);
				rs1=model1.ViewMovieData();
				while(rs1.next())
				{
					model1.setMovieId(rs1.getString(1));
					model1.DeleteMovieData();
				}
				boolean result2=model2.deletePaymentData();
				System.out.println("result2:"+result2);
				response.sendRedirect("");
			}
			else
			{
				
				out.print("Sorry.Invalid Credentials!");
			}
		}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
