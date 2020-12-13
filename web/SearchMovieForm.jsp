<%@page import="com.cognizant.model.MovieModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>

<!-- ***********   START   *********** -->
<jsp:include page="layout/Header.jsp" />
<jsp:include page="layout/UserSidebar.jsp" />
<script type="text/javascript" src="assets/js/blank.js"></script>
<!-- Session validation for Movie operator  -->
<%
    if (session.getAttribute("type") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<!-- session validation ends -->
<div id="main">
<div class="mymainWrapper col-lg-9 col-md-9 col-sm-12 col-xs-12"style="padding-top: 50px">
    <div class="centerformWrapper col-lg-4 col-md-6 col-sm-12 col-xs-4">
        <div class="centertitle row col-lg-12 col-md-12 col-sm-12 col-xs-12">
            SEARCH Movie
        </div>
        <%
            String msg = request.getParameter("msg");
            if (msg != null) {
                out.print(msg);
            }
        %>
        <div class="centerform col-lg-12 col-md-12 col-sm-12c col-xs-12">
            <form name="SearchMovieFormController" action="SearchMovieFormController"
                  onsubmit="return validateLogin12();" method="post">
                <div class="form-group">
                    <label for="from">Search Movies</label>
                    <select name="from" id="from" class="flexselect form-control">						
                        <option value=""></option>
                        <%
                            MovieModel model = new MovieModel();
                            ResultSet rs = model.getMovieInfo1(1);

                            while (rs.next()) {%>

                        <option value="<%=rs.getString(1)%>"><%=rs.getString(1).toUpperCase()%></option>
                        <%} %>
                    </select>
                </div>
                <div class="form-group">
                    <label for="to">Theater</label>
                    <select name="to" id="to" class="flexselect form-control">
                        <option value=""></option>
                        <%
                            ResultSet rs1 = model.getMovieInfo1(2);

                            while (rs1.next()) {%>
                        <option value="<%=rs1.getString(1)%>"><%=rs1.getString(1).toUpperCase()%></option>
                        <%}%>	
                    </select>
                </div>
                <div class="form-group">
                    <label for="from">Date</label>
                    <input class="tcal" type="text" name="date" />
                </div>
              <div class="form-group">
                 &emsp;&emsp;&emsp; <button type="submit" class="btn btn-success">Search</button>&emsp;&emsp;&emsp;
                    <button type="reset" class="btn btn-warning">Reset</button>
                </div>
                    
                  
            </form>	
        </div>
    </div>
</div>
</div>