<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:include page="layout/Header.jsp" />
<jsp:include page="layout/UserSidebar.jsp" />

<!-- Session validation for Committee Member  -->
<%
	if(session.getAttribute("type")==null ){
		response.sendRedirect("index.jsp");
	}
%>
<!-- session validation ends -->


<!-- ***********   START   *********** -->
<div id="main">
<div class="dashboard container col-lg-9 col-md-9 col-sm-12 col-xs-12">
	<div class="dashboardBody col-lg-12 col-md-12 col-sm-12 col-xs-12">
		<div class="formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12">User Dashboard</div>
		<div class="dashboarddiv col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="odd col-lg-3 col-md-4 col-sm-12 col-xs-12">
				<div class="dashimg">
					<span class="glyphicon glyphicon-search"></span>Search Movie
				</div>
				<div class="dashcontent">
					<a href="SearchMovieForm.jsp">Search</a>
				</div>
			</div>
			<div class="even col-lg-3 col-md-3 col-sm-12 col-xs-12">
				<div class="dashimg">
					<span class="glyphicon glyphicon-list-alt"></span>Payment
					</div>
				<div class="dashcontent">					
					<a href="UserPaymentSearch.jsp">Go</a>
				</div>
			</div>
			<div class="odd  col-lg-3 col-md-3 col-sm-12 col-xs-12">		
				<div class="dashimg">
					<span class="glyphicon glyphicon-eye-open"></span>View Booking
				</div>
				<div class="dashcontent">
					<a href="GetBookingHistory.jsp">View</a>	
				</div>
			</div>
			<div class="even  col-lg-3 col-md-3 col-sm-12 col-xs-12">						
				<div class="dashimg">
					<!-- <img src="assets/img/4.png"/> -->
					<span class="glyphicon glyphicon-remove"></span>Cancel Ticket
				</div>
				<div class="dashcontent">
					<a href="CancelTicket.jsp">View</a>
				</div>
			</div>
			<div class="odd  col-lg-3 col-md-3 col-sm-12 col-xs-12">
				<div class="dashimg">
				<span class="glyphicon glyphicon-off"></span>Logout
				</div>
				<div class="dashcontent">
					<a href="Logout.jsp">Logout</a>
				</div>			
			</div>
		</div>
	</div>
</div>
</div>
<!-- ***********   basha html ends   *********** -->







