<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<script type="text/javascript" src="assets/js/blank.js"></script>


<link rel="stylesheet" href="assets/css/login.css" type="text/css" media="screen" />
<!-- ***********   START   *********** -->
<div  class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
        <%
            if (request.getParameter("msg") != null) {
        %>
        <h4 style="color:black;"><%=request.getParameter("msg")%></h4>
        <%
            }
        %>
    </div>
<div class="container">
        <div class="regbox box" style="margin-top: 100px">
            <!--<img class="avatar" src="View/img/loginform_background.png">-->

            <h1 style="font-family:courier;font-size:300%">Admin LogIN</h1>
            <form name="LoginFormController" action="LoginFormController"
                  onsubmit="return validateLogin13();" method="post">


                <input type="text" 
                       id="email"
                       name="username" placeholder="Email">


                <input type="password" id="password" name="password" placeholder="Password">
                
                <a href="ForgotPassword1.jsp" class="col-md-12"style="margin: 4px;margin-bottom: 20px ">Forgot Password?</a>
                <!--change here-->
                <div class="form-group">
					<input type="hidden" name="type" value="admin"/>
				</div>
                    <input type="submit" value="Login"/>
                    <input type="reset" value="Clear"/>
                
            </form>
                






