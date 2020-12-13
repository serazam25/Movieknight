<%@page import="com.cognizant.model.MovieModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>

<jsp:include page="layout/Header.jsp" />
<jsp:include page="layout/UserSidebar.jsp" />

<%
    HttpSession session1 = request.getSession();
    if (session1.getAttribute("userid") != null) {
%>	
<%--<jsp:include page="layout/UserSidebar.jsp" />--%>
<% } %>
<script type="text/javascript" src="assets/js/blank.js"></script>

<!-- ***********   START   *********** -->

<%
    String MovieId = request.getParameter("Movieid");
%>

<div class="errordiv col-lg-9 col-md-9 col-sm-10 col-xs-10">
    <%
        if (request.getParameter("msg") != null) {
    %>
    <h4><%=request.getParameter("msg")%></h4>
    <%
        }
    %>
</div>
<div id="main">
    <div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
                Book a Ticket
            </div>
            <%
                MovieModel bm = new MovieModel();
                ResultSet rs = bm.getMovieInfo(request.getParameter("Movieid"));
                String departureDate = "";
                departureDate = request.getParameter("date");
                String departureTime = "";
                String ticketPrice = "";
            %>
            <!-- ********  Enter seat details   *********** -->
            <div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <table class ="col-lg-6 col-md-6 col-sm-12 col-xs-12 table table-bordered">
                    <tr>
                        <th>Movie ID</th>
                        <th>Movie Name</th>
                        <th>Movie Type</th>
                        <th>booked Date</th>
                        <th>Show Time</th>
                        <th>Theater</th>
                        <th>Cost</th>
                    </tr>
                    <%
                        while (rs.next()) {
                    %>				
                    <tr>
                        <td><%=rs.getString(1)%>
                        <td><%=rs.getString(2)%>
                        <td><%=rs.getString(3)%>
                        <td><%=departureDate%>
                        <td><%=rs.getString(5)%>
                        <td><%=rs.getString(6)%>
                        <td><%=rs.getString(8)%>
                    </tr>
                    <%

                            departureTime = rs.getString(5);
                            ticketPrice = rs.getString(8);
                        }
                        rs.close();
                    %>
                </table>
            </div>
            <!-- ********  Enter seat details   *********** -->

            <div class="centerformWrapper col-lg-6 col-md-6 col-sm-2 col-xs-2">
                <div class="centerform col-lg-12 col-md-4 col-sm-12 col-xs-12">
                    <form name="bookTicket" action="BookTicketFormController" onsubmit="return validateLogin3();" method="post">

                        <div class="form-group">
                            <label for="noOfseats">Enter number of seats to book</label>
                            <input type="text" name="noOfseats" class="form-control">
                        </div>
                        <%
                            if (session1.getAttribute("userid") == null) {
                        %>	
                        <div class="form-group">
                            <label for="username">Enter your email</label>
                            <input type="text" name="email" class="form-control">
                        </div>			
                        <% }%>
                        <div class="form-group">
                            <label for="Movieid">Movie Id</label>
                            <input type="text" name="Movieid"  class="form-control" value="<%=MovieId%>"/>
                        </div>
                        <div class="form-group">
                            <label for="deptdate">Departure Date</label>
                            <input type="text" name="deptdate"  class="form-control" value="<%=departureDate%>"/>
                        </div>
                        <div class="form-group">
                            <label for="depttime">Departure Time</label>
                            <input type="text" name="depttime"  class="form-control" value="<%=departureTime%>"/>
                        </div>
                        <input type="hidden" name="ticketPrice" value="<%=ticketPrice%>"/>
                        <div class="form-group">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                            <button type="submit" name="submit" class="btn btn-success">Confirm Reservation</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
