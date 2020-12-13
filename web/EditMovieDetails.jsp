<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:include page="layout/Header.jsp" />
<jsp:include page="layout/UserSidebar.jsp" />
<script type="text/javascript" src="assets/js/blank.js"></script>

<!-- Session validation for Movie operator  -->
<%
	if(session.getAttribute("type")==null || (!session.getAttribute("type").equals("Movieoperator"))){
		response.sendRedirect("MovieOperatorLogin.jsp");
	}
%>
<!-- session validation ends -->


<!-- ***********   START   *********** -->
<div id="main">
<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
	<div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
		<div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
			EDIT Movie DETAILS
		</div>
		<div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
		
		<form name="EditMovieDetailsForm" action="EditMovieDetailsFormController"
				onsubmit="return validateLogin8();" method="post">
			
				<div class="form-group">
					<label for="Moviename">Enter Movie Name</label>
					<input type="text" name="Moviename" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="Movietype">Enter Movie Type</label>
					<select class="form-control" name="Movietype">
						<option value="AC">AC</option>
						<option value="Non-AC">NON-AC</option>
					</select>
					<label for="Moviename1">  </label>
					<select class="form-control" name="Movietype1">
						<option value="Non-Sleeper">NonSleeper</option>
						<option value="Sleeper">Sleeper</option>						
						<option value="Semi-Sleeper">SemiSleeper</option>
					</select>
				</div>
				<div class="form-group">
					<label for="departurecity">Enter Departure City</label>
					<input type="text" name="departurecity" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="arrivalcity">Enter Arrival City</label>
					<input type="text" name="arrivalcity" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="departuretime">Enter Departure Time in 24-hr format(HH:MM)</label>
					<input type="text" name="departuretime" class="form-control" />
				</div>
				<div class="form-group">
					<label for="traveltime">Enter Travel Time in 24-hr format(HH:MM)</label>
					<input type="text" name="traveltime" class="form-control" />
				</div>
				<div class="form-group">
					<label for="OperatingDays">Enter Operating Days</label><br/>
					<input type="checkbox" name="OperatingDays" value="Sunday">Sunday<br/>
					<input type="checkbox" name="OperatingDays" value="Monday">Monday<br/>
					<input type="checkbox" name="OperatingDays" value="Tuesday">Tuesday<br/>
					<input type="checkbox" name="OperatingDays" value="Wednesday">Wednesday<br>
					<input type="checkbox" name="OperatingDays" value="Thursday">Thursday<br/>
					<input type="checkbox" name="OperatingDays" value="Friday">Friday<br/>
					<input type="checkbox" name="OperatingDays" value="Saturday">Saturday<br>
				</div>
				<div class="form-group">
					<label for="cost">Cost of travel</label>
					<input type="text" name="cost" class="form-control"/>
				</div>
				<div class="form-group">
					<label for="noofseats">Number of Seats</label>
					<input type="text" name="noofseats" class="form-control" />
				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-danger" value="Edit">
					<input type="reset"  class="btn btn-danger" value="Cancel">
				</div>	
			</form>	
		</div>
	</div>
</div>
</div>






