

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="layout/Header.jsp" />
<jsp:include page="layout/Commitee_member.jsp" />
<link href="assets/css/Committee_member.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/navbar.css" rel="stylesheet" type="text/css"/>
<script src="assets/js/navbar.js" type="text/javascript"></script>
<!-- Session validation for Movie operator  -->
<%
	if(session.getAttribute("type")==null || (!session.getAttribute("type").equals("Movieoperator"))){
		response.sendRedirect("MovieOperatorLogin.jsp");
	}
%>
<!-- session validation ends -->


<!-- ***********   START   *********** -->


<!-- Add all page content inside this div if you want the side nav to push page content to the right (not used if you only want the sidenav to sit on top of the page -->
<div id="main">
 

<div class="dashboard container col-lg-9 col-md-9 col-sm-9 col-xs-7">
	<div class="dashboardBody col-lg-12 col-md-12 col-sm-12 col-xs-12">
		<div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
		<%
	try {
		String msg = "";
		if (request.getParameter("msg") != null) {
			msg = request.getParameter("msg");
			out.print("<div><p>" + msg + "</p></div>");
			System.out.print("kkkk");
		}
	} catch (Exception e) {
	}
%>

</div>
		<div class="dashboarddiv col-lg-12 col-md-12 col-sm-12 col-xs-12"style="background-image: url(../img/admin_background.jpg)">
			<div class="odd col-lg-3 col-md-3 col-sm-3 col-xs-3">
				<div class="dashimg">
					Add new Movie
				</div>
				<div class="dashcontent">
					<a href="AddNewMovie.jsp">Add</a>
				</div>
			</div>
			<div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
				<div class="dashimg">
					Show Movies
					</div>
				<div class="dashcontent">					
					<a href="GetAddedMoviees.jsp">Show</a>
				</div>
			</div>
			<div class="odd  col-lg-3 col-md-3 col-sm-3 col-xs-3">			
				<div class="dashimg">
					Change Password
				</div>
				<div class="dashcontent">
					<a href="ChangePassword.jsp">Change</a>	
				</div>
			</div>
			<div class="odd  col-lg-3 col-md-3 col-sm-3 col-xs-3">			
				<div class="dashimg">
					Delete account
				</div>
				<div class="dashcontent">
					<a href="DeleteMovieOperator.jsp">Delete</a>	
				</div>
			</div>
		</div>
	</div>
</div>
</div>
<!-- ***********   basha html ends   *********** -->


-------------------------------------------------------------------------------------------------------

