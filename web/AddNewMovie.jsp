<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.cognizant.model.MovieModel"%>
<%@page import="java.sql.ResultSet"%>

<!-- Session validation for Movie operator  -->
<%
	if(session.getAttribute("type")==null || (!session.getAttribute("type").equals("Movieoperator"))){
		response.sendRedirect("MovieOperatorLogin.jsp");
	}
%>
<!-- session validation ends -->

<jsp:include page="layout/Header.jsp" />
<jsp:include page="layout/Commitee_member.jsp" />
<link href="assets/css/Committee_member.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/navbar.css" rel="stylesheet" type="text/css"/>
<script src="assets/js/navbar.js" type="text/javascript"></script>
<script type="text/javascript" src="assets/js/blank.js"></script>
<script type="text/javascript" src="assets/blank.js"></script>
<!-- ***********   START   *********** -->
<div id="main">
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
	<div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
		<div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
			Add new movie</div>


		<div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
			<%
				if (request.getParameter("msg") != null) {
			%>
			<h4><%=request.getParameter("msg")%></h4>
			<%
				}
			%>
		</div>
                <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
                    <form name="myForm" action="AddNewMovieFormController"
				onsubmit="return validateLogin();" method="post">
				<div class="form-group">
					<label for="Moviename">Enter Movie Name</label> <input type="text"
						name="Moviename" class="form-control" />
				</div>
				<div class="form-group">
					<label for="Movietype">Enter Movie Type</label> <select name="Movietype1"
						class="form-control">
						<option Value="AC">Action</option>
						<option Value="Non-AC">Drama</option>
                                                
						<option Value="Non-AC">Horror</option>
                                                
						<option Value="Non-AC">Comedy</option>
					</select> 
				</div>
				<div class="form-group">
					<label for="departurecity">Enter Theater </label> <input
						type="text" name="departurecity" class="form-control" />
				</div>
				
				<div class="form-group">
					<label for="departuretime">Enter Starting Time in 24Hr
						format</label> <input type="text" name="departuretime"
						class="form-control" />
				</div>
				<div class="form-group">
					<label for="traveltime">Enter Show Time in 24-hr
						format(HH:MM) </label> <input type="text" name="traveltime"
						class="form-control" />
				</div>
				<div class="form-group">
					<label for="operatingdays">Enter Showing Days </label><br /> <input
						type="checkbox" name="OperatingDays1" value="S" checked>Sunday<br />
					<input type="checkbox" name="OperatingDays2" value="M">Monday<br />
					<input type="checkbox" name="OperatingDays3" value="T">Tuesday<br />
					<input type="checkbox" name="OperatingDays4" value="W">Wednesday<br />
					<input type="checkbox" name="OperatingDays5" value="T">Thursday<br />
					<input type="checkbox" name="OperatingDays6" value="F">Friday<br />
					<input type="checkbox" name="OperatingDays7" value="S">Saturday<br />
				</div>
				<div class="form-group">
					<label for="cost">Ticket Price</label> <input type="text"
						name="cost" class="form-control" />
				</div>
				<div class="form-group">
					<label for="Number of Seats">Number of Seats </label> <input
						type="text" name="seats" class="form-control" />
				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-success" value="Add" /> <input
						type="reset" class="btn btn-danger" value="Cancel" />
				</div>
			</form>
		</div>
	</div>
</div>
</div>
<!-- ********************************* -->