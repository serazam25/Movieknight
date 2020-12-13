<%@page import="com.cognizant.model.MovieOperatorModel"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.cognizant.model.UserModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
	<!-- Session validation for Movie operator  -->
<%
	if(session.getAttribute("type")==null ){
		response.sendRedirect("index.jsp");
	}
%>
<!-- session validation ends -->
	

<jsp:include page="layout/Header.jsp" />

<%
	if (session.getAttribute("type").equals("user")) {
%>
<jsp:include page="layout/UserSidebar.jsp" />
<%
	} else {
%>
<jsp:include page="layout/Commitee_member.jsp" />
<link href="assets/css/Committee_member.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/navbar.css" rel="stylesheet" type="text/css"/>
<script src="assets/js/navbar.js" type="text/javascript"></script>
<%
	}
%>
<script type="text/javascript" src="assets/js/blank.js"></script>

<!-- ***********   START   *********** -->
<div id="main">
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
	<div class="centerformWrapper col-lg-6 col-md-6 col-sm-12 col-xs-4">
		<div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
			EDIT PROFILE</div>
		<div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
			<%
				try {
					if (request.getParameter("msg") != null) {
						out.print("<div>" + request.getParameter("msg") + "</div>");
					}
				} catch (Exception e) {
					out.print("some error occured..");
				}
			%>
		</div>
		<%
			if (session.getAttribute("type").equals("user")) {
				UserModel um = new UserModel();
				um.setUserID(String.valueOf(session.getAttribute("userid")));
				ResultSet rs = um.getUserData();
				while (rs.next()) {
		%>
		<div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
			<form name="EditProfileFormController"
				action="EditProfileFormController"
				onsubmit="return validateLogin9();" method="post">

				<div class="form-group">
					<label for="firstname">FirstName</label> <input type="text"
						name="firstname" class="form-control" value="<%=rs.getString(2)%>" />
				</div>
				<div class="form-group">
					<label for="lastname">LastName</label> <input type="text"
						name="lastname" class="form-control" value="<%=rs.getString(3)%>" />
				</div>
				<div class="form-group">
					<label for="address">Address</label> <input type="text"
						name="address" class="form-control" value="<%=rs.getString(4)%>" />
				</div>
				<div class="form-group">
					<label for="city">City</label> <input type="text" name="city"
						class="form-control" value="<%=rs.getString(5)%>" />
				</div>
				<div class="form-group">
					<label for="email">EMail</label> <input type="text" name="email"
						class="form-control" value="<%=rs.getString(6)%>" />
				</div>
				<div class="form-group">
					<label for="phonenumber">Phone Number</label> <input type="text"
						name="phonenumber" class="form-control"
						value="<%=rs.getString(7)%>" />
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-success">Update</button>
				</div>
			</form>
			<%
				}
					rs.close();
				} else {
					MovieOperatorModel bom = new MovieOperatorModel();
					bom.setOperatorID(String.valueOf(session.getAttribute("userid")));
					ResultSet rs = null;
					rs = bom.getOperatorData();
					while (rs.next()) {
			%>

			<div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
				<form name="EditProfileFormController" action="EditProfileFormController" onsubmit="return validateLogin9();" method="post">
					<div class="form-group">
						<label for="email">EMail</label> <input type="text" name="email"
							class="form-control" value="<%=rs.getString(4)%>" />
							 <input type="hidden" name="lastname"  value="<%=rs.getString(4)%>" />
							 <input type="hidden" name="type"  value="MovieOperator" />
					</div>
					<div class="form-group">
						<label for="firstname">Name</label> <input type="text"
							name="firstname" class="form-control" value="<%=rs.getString(2)%>" />
					</div>
					<div class="form-group">
						<label for="address">Address</label> <input type="text"
							name="address" class="form-control" value="<%=rs.getString(3)%>" />
					</div>
					<div class="form-group">
						<label for="city">City</label> <input type="text" name="city"
							class="form-control" value="<%=rs.getString(5)%>" />
					</div>

					<div class="form-group">
						<label for="phonenumber">Phone Number</label> <input type="text"
							name="phonenumber" class="form-control"
							value="<%=rs.getString(6)%>" />
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-danger">Update</button>
					</div>
					<%
						}
						}
					%>
				</form>				
			</div>
		</div>
	</div>
</div>
	
</div>
	<!-- ********************************* -->
	