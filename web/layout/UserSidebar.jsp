
<link href="assets/css/navbar.css" rel="stylesheet" type="text/css"/>
<script src="assets/js/navbar.js" type="text/javascript"></script>
<link href="assets/css/admin_homepage.css" rel="stylesheet" type="text/css"/>
<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <%
	try {
		String msg = "";
		if (request.getParameter("msg") != null) {
			out.print("<div class='errorMessage'>" + msg + "</div>");
		}
	} catch (Exception e) {

	}

	try {
		if (session.getAttribute("type").equals("user")) {
			out.print("Welcome, "
					+ session.getAttribute("email"));
		}
	} catch (Exception e) {

	}
%>
                <a href="indexUser.jsp">Home</a>
		<a href="SearchMovieForm.jsp">Search movies and book ticket</a>
		<a href="UserPaymentSearch.jsp">Payment</a>
		<a href="CancelTicket.jsp">Cancel Ticket</a>
		<a href="GetBookingHistory.jsp">View booking history</a>
		<a href="EditProfile.jsp">Edit profile</a>
		<a href="ChangePassword.jsp">Change password</a>
		<a href="DeleteUser.jsp">Delete account</a>
		<a href="Logout.jsp">Logout</a>
</div>
<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;</span>
	