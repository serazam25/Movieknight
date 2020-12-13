<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.cognizant.model.*"%>
<%@page import="com.cognizant.controller.DeleteMovieDetailsController"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.servlet.http.*"%>
<jsp:include page="layout/Header.jsp" />
<jsp:include page="layout/Commitee_member.jsp" />
<link href="assets/css/Committee_member.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/navbar.css" rel="stylesheet" type="text/css"/>
<script src="assets/js/navbar.js" type="text/javascript"></script>
<!-- Session validation for Movie operator  -->
<%
    if (session.getAttribute("type") == null || (!session.getAttribute("type").equals("Movieoperator"))) {
        response.sendRedirect("MovieOperatorLogin.jsp");
    }
%>
<!-- session validation ends -->


<!-- ***********   START   *********** -->
<%
    String operatorID = String.valueOf(session.getAttribute("userid"));
    System.out.print(operatorID);
    ResultSet rs = null;
    MovieModel model = new MovieModel();
    model.setOperatorID(operatorID);
    rs = model.ViewMovieData();
%>
<div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
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
                Added Movies
            </div>
            <div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <table class ="table table-bordered">
                    <tr>
                        <td>Movie Id</td>
                        <td>Movie Name</td>
                        <td>Movie Type</td>
                        <td>theater</td>
                        <td>show Time</td>
                        <td>Cost</td>
                        <td>Operating Days</td>
                        <td>Seats</td>
                        <td>  </td>
                        <td>  </td>
                    </tr>
                    <%
                        String Movieid = "";
                        String Moviename = "";
                        String Movietype = "";
                        String departuretime = "";
                        String traveltime = "";
                        String sourcecity = "";
                        String destinationcity = "";
                        float cost = 0;
                        int seats = 0;
                        String days = "";

                        while (rs.next()) {
                            if (Movieid.equals("")) {
                                Movieid = rs.getString(1);
                                Moviename = rs.getString(2);
                                Movietype = rs.getString(3);
                                sourcecity = rs.getString(4);
                                departuretime = rs.getString(6);
                                cost = rs.getFloat(8);
                                days = days + rs.getString(9);
                                seats = rs.getInt(10);
                            } else {
                                if (Movieid.equals(rs.getString(1))) {
                                    days = days + ",";
                                    days = days + rs.getString(9);
                                } else {
                    %>
                    <tr>
                        <td><%=Movieid%></td>
                        <td><%=Moviename%></td>
                        <td><%=Movietype%></td>
                        <td><%=sourcecity%></td>
                        <td><%=destinationcity%></td>
                        <td><%=departuretime%></td>
                        <td><%=traveltime%></td>
                        <td><%=cost%></td>
                        <td><%=days%></td>
                        <td><%=seats%></td>
                        <td>
                            <a href="EditMovieDetails.jsp?Movieid=<%=Movieid%>"><span class="glyphicon glyphicon-edit"></span></a>
                        </td>
                        <td>
                            <a href="DeleteMovieDetailsController?Movieid=<%=Movieid%>"><span class="glyphicon glyphicon-trash"></span></a>
                        </td>
                    </tr>
                    <%
                                    Movieid = rs.getString(1);
                                    Moviename = rs.getString(2);
                                    Movietype = rs.getString(3);
                                    sourcecity = rs.getString(4);
                                    destinationcity = rs.getString(5);
                                    departuretime = rs.getString(6);
                                    traveltime = rs.getString(7);
                                    cost = rs.getFloat(8);
                                    days = rs.getString(9);
                                    seats = rs.getInt(10);
                                }
                            }
                        }
                    %>
                    <tr>
                        <td><%=Movieid%></td>
                        <td><%=Moviename%></td>
                        <td><%=Movietype%></td>
                        <td><%=sourcecity%></td>
                        <td><%=destinationcity%></td>
                        <td><%=departuretime%></td>
                        <td><%=traveltime%></td>
                        <td><%=cost%></td>
                        <td><%=days%></td>
                        <td><%=seats%></td>
                        <td>
                            <a href="EditMovieDetails.jsp?Movieid=<%=Movieid%>"><span class="glyphicon glyphicon-edit"></span></a>
                        </td>
                        <td>
                            <a href="DeleteMovieDetailsController?Movieid=<%=Movieid%>"><span class="glyphicon glyphicon-trash"></span></a>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</div>
<!-- ********************************* -->






