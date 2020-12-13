<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<jsp:include page="layout/Header.jsp" />

<!-- ***********   START   *********** -->
<div id="main">
<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div class="tableWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            Search Results
        </div>
        <div class="tableContent col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <table class ="col-lg-6 col-md-6 col-sm-12 col-xs-12 table table-bordered">
                <tr>
                    <td>Movie ID</td>
                    <td>Movie Name</td>
                    <td>Movie Type</td>
                    <td>Show Time</td>
                    <td>Theater</td>
                    <td>Cost</td>
                    <td>Booking</td>
                </tr>
                <%
                    ResultSet rs = (ResultSet) request.getAttribute("MovieInformation");
                    try {
                        while (rs.next()) {
                %>
                <tr>
                    <td><%=rs.getString(1)%>
                    <td><%=rs.getString(2)%>
                    <td><%=rs.getString(3)%>
                    <td><%=rs.getString(5)%>
                    <td><%=rs.getString(7)%>
                    <td><%=rs.getString(8)%>
                    <td><a href="BookTicket.jsp?Movieid=<%=rs.getString(1)%>&date=<%=String.valueOf(request.getAttribute("Date"))%>">confirm</a></td>
                </tr>
                <%
                        }
                        rs.close();

                    } catch (Exception e) {

                    }
                %>
            </table>
        </div>
    </div>
</div>
</div>