<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.cognizant.model.*" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- Session validation for Movie operator  -->
<%
	if(session.getAttribute("type")==null ){
		response.sendRedirect("AdminLogin.jsp");
	}
%>
<!-- session validation ends -->
<jsp:include page="layout/Header.jsp" />

<jsp:include page="layout/AdminSidebar.jsp" />
<link href="assets/css/admin_homepage.css" rel="stylesheet" type="text/css"/>
<!-- ***********   START   *********** -->
<%
MovieOperatorModel model = new MovieOperatorModel();
ResultSet rs=model.getAllOperatorData();
%>

<div class="errordiv">
	<%
		if (request.getParameter("msg") != null) {
	%>
	<h4 style="color:red"><%=request.getParameter("msg")%></h4>
	<%
		}
	%>
		</div>
                <div id="main">
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
	<div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
		<div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
			Delete Movie Operator
		</div>
		<div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<table class ="table table-bordered">
				<tr>
					<td>Operator Id</td>
					<td>Operator Name</td>
					<td>Address</td>
					<td>EMail</td>
					<td>City</td>
					<td>Phone Number</td>
					<td>Password</td>
					<td>  </td>
				</tr>
				<%
					while(rs.next())
					{
				%>
				<tr>
					<td><%=rs.getString(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getString(3) %></td>
					<td><%=rs.getString(4) %></td>
					<td><%=rs.getString(5) %></td>
					<td><%=rs.getString(6) %></td>
					<td><%=rs.getString(7) %></td>
					<td><a href="DeleteMovieOperatorByAdminController?operatorid=<%=rs.getString(1)%>"><span class="glyphicon glyphicon-trash"></span></a></td>
				</tr>
				<%} %>
			</table>
		</div>
	</div>
</div>
                </div>