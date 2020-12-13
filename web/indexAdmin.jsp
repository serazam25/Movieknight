<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:include page="layout/Header.jsp" />
<link href="assets/css/admin_homepage.css" rel="stylesheet" type="text/css"/>
<!-- Session validation for Committee Member  -->
<%
	if(session.getAttribute("type")==null ){
		response.sendRedirect("index.jsp");
	}
%>
<!-- session validation ends -->


<!-- ***********   START   *********** -->
<jsp:include page="layout/AdminSidebar.jsp" />
<div id="main">
<div class="dashboard container col-lg-9 col-md-9 col-sm-9 col-xs-7">
	<div class="dashboardBody col-lg-12 col-md-12 col-sm-12 col-xs-12">
		<div class="formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12">Admin Dashboard</div>
		<div class="dashboarddiv col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="odd col-lg-3 col-md-3 col-sm-3 col-xs-3">
				<div class="dashimg">
                                    <a href="com/cognizant/controller/AddNewMovieFormController.java"></a>
                                    <a href="../src/java/com/cognizant/controller/EditMovieDetailsFormController.java"></a>
					View Committee Member
				</div>
				<div class="dashcontent">
					<a href="ViewMovieOperators.jsp">View</a>
				</div>
			</div>
			<div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
				<div class="dashimg">
					Add Committee Member
					</div>
				<div class="dashcontent">					
					<a href="addnewMovieoperator.jsp">Add</a>
				</div>
			</div>
			<div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
				<div class="dashimg">
					Delete Committee Member
					</div>
				<div class="dashcontent">					
					<a href="DeleteMovieOperatorByAdmin.jsp">Delete</a>
				</div>
			</div>
			<div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
				<div class="dashimg">
					View Users
					</div>
				<div class="dashcontent">					
					<a href="ViewRegisteredUsers.jsp">View</a>
				</div>
			</div>
			<div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
				<div class="dashimg">
					View Bookings
					</div>
				<div class="dashcontent">					
					<a href="ViewAllBookings.jsp">View</a>
				</div>
			</div>
			<div class="even col-lg-3 col-md-3 col-sm-3 col-xs-3">
				<div class="dashimg">
					Logout
					</div>
				<div class="dashcontent">					
					<a href="Logout.jsp">Signout</a>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
<!-- ***********   basha html ends   *********** -->
