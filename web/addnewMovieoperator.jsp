<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<jsp:include page="layout/Header.jsp" />
<script type="text/javascript" src="assets/js/blank.js"></script>
<jsp:include page="layout/AdminSidebar.jsp" />
<link href="assets/css/admin_homepage.css" rel="stylesheet" type="text/css"/>

<div id="main">
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
	<div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
		<div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<!-- code to display error message  -->
			<%if(request.getParameter("msg")!=null){%>
				<h4><%=request.getParameter("msg") %></h4>	
			<%}%>
			<!-- error message code ends here -->			
			ADD NEW Committee Member
		</div>
		<div class="centerform col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<form name="AddNewMovieOperatorFormController" action="AddNewMovieOperatorFormController" onsubmit="return validateLogin1();" method="post">
				<div class="form-group">
					<label for="Movieoperatorname">Enter Committee Member Name</label>
					<input type="text" name="Movieoperatorname" class="form-control" />
				</div>
				<div class="form-group">
					<label for="email">Enter Committee Member Email</label>
					<input type="text" name="email" class="form-control" />
				</div>
				<div class="form-group">
					<label for="address">Enter Address</label> 
					<input type="text" name="address" class="form-control" />
				</div>
				<div class="form-group">
					<label for="city">Enter City</label> 
					<input type="text" name="city" class="form-control" />
				</div>
				<div class="form-group">
					<label for="phonenumber">Enter Phone Number</label>
					<input type="text" name="phonenumber" class="form-control" />
				</div>
				<div class="form-group">
					<label for="password">Enter Password</label>
					<input type="text" name="password" class="form-control" />
				</div>
				<div class="form-group">
					<label for="password">Re-enter Password</label>
					<input type="text" name="newpassword" class="form-control" />
				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-danger" value="Submit" />
					<input type="reset" class="btn btn-danger" value="Reset" />
				</div>
			</form>
		</div>
	</div>
</div>
</div>