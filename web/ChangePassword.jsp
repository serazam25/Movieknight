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
	<% } else {

		%>
<jsp:include page="layout/Commitee_member.jsp" />
<link href="assets/css/Committee_member.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/navbar.css" rel="stylesheet" type="text/css"/>
<script src="assets/js/navbar.js" type="text/javascript"></script>
<% } %>
<script type="text/javascript" src="assets/js/blank.js"></script>
<!-- ***********   START   *********** -->
<div id="main">
<div class="mymainWrapper col-lg-9 col-md-12 col-sm-12 col-xs-12">
	<div class="centerformWrapper col-lg-6 col-md-6 col-sm-12 col-xs-4">
		<div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
			CHANGE PASSWORD</div>
		<div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
			<%
				if (request.getParameter("msg") != null) {
			%>
			<p><%=String.valueOf(request.getParameter("msg"))%>
				<%
					}
				%>
			
		</div>
		<div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
			<form name="ChangePasswordFormController" action="ChangePasswordFormController"
				onsubmit="return validateLogin5();" method="post">

				<div class="form-group">
					<label for="oldpassword">Old Password</label> <input
						type="password" name="oldpassword" class="form-control" />
				</div>
				<div class="form-group">
					<label for="newpassword">New Password</label> <input
						type="password" name="newpassword" class="form-control" />
				</div>
				<div class="form-group">
					<label for="confirmpassword">Confirm Password</label> <input
						type="password" name="confirmpassword" class="form-control" />
				</div>
				<%
					if (String.valueOf(session.getAttribute("type")).equalsIgnoreCase(
							"admin")) {
				%>
				<div class="form-group">
					<input type="hidden" name="uname"
						value="<%=String.valueOf(session.getAttribute("email"))%>" />
				</div>

				<%
					}
				%>
				<div class="form-group">
					<input type="submit" class="btn btn-success" value="Submit" /> <input
						type="reset" class="btn btn-danger" value="Reset" />
				</div>
			</form>
		</div>
	</div>
</div>

</div>
<!-- ********************************* -->
