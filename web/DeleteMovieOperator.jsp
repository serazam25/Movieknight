<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:include page="layout/Header.jsp" />
<script type="text/javascript" src="assets/js/blank.js"></script>
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
<div id="main">
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12">
	<div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
		<div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
			DELETE MovieOPERTOR</div>


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
			<form name="deleteMovieoperator"
				action="DeleteMovieOperatorFormController"
				onsubmit="return validateLogin6();" method="post">

				<div class="form-group">
					<label for="phonenumber">Enter Phone No:</label> <input type="text"
						id="phonenumber" class="form-control" name="phonenumber">
				</div>
				<div class="form-group">
					<label for="password">Enter Password:</label> <input
						type="password" id="password" class="form-control" name="password">
				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-success" value="Delete Account">
					<input type="reset" class="btn btn-danger" value="Cancel">
				</div>
			</form>
		</div>
	</div>
</div>
</div>
<!-- ********************************* -->






