<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="com.cognizant.model.MovieModel" %>
<link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
<link rel="stylesheet" href="assets/css/login.css" type="text/css" media="screen" />

<!--for form validation-->
<script type="text/javascript" src="assets/js/blank.js"></script>

<script src="assets/js/jquery.min.js" type="text/javascript"></script> 
<script src="assets/js/liquidmetal.js" type="text/javascript"></script>
<script src="assets/js/jquery.flexselect.js" type="text/javascript"></script>



<script>
    $(document).ready(function () {
        $("select.flexselect").flexselect();
    });
</script>

<!--for calender-->
<script>
    jQuery(function () {
        jQuery("#inf_custom_someDateField").datepicker();
    });
</script>

<script type="text/javascript">
    document.onkeydown = function (event) {

        if (!event) { /* This will happen in IE */
            event = window.event;
        }

        var keyCode = event.keyCode;

        if (keyCode == 8 &&
                ((event.target || event.srcElement).tagName != "TEXTAREA") &&
                ((event.target || event.srcElement).tagName != "INPUT")) {

            if (navigator.userAgent.toLowerCase().indexOf("msie") == -1) {
                event.stopPropagation();
            } else {
                alert("prevented");
                event.returnValue = false;
            }

            return false;
        }
    };
</script>





<!-- ***********   START   *********** -->

<!--show message coming from java class-->
<div class="mymainWrapper col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <div  class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
        <%
            if (request.getParameter("msg") != null) {
        %>
        <h4 style="color:black;"><%=request.getParameter("msg")%></h4>
        <%
            }
        %>
    </div>

    <!--Login Part-->
    <div class="container">
        <div class="regbox box" style="margin-top: 100px;margin-left: 100px">
            <!--<img class="avatar" src="View/img/loginform_background.png">-->

            <h1 style="font-family:courier;font-size:300%">LogIN</h1>
            <form name="LoginFormController" action="LoginFormController"
                  onsubmit="return validateLogin13();" method="post">


                <input type="text" 
                       id="email"
                       name="username" placeholder="Email">


                <input type="password" id="password" name="password" placeholder="Password">
                
                <a href="ForgotPassword1.jsp" class="col-md-12"style="margin: 4px;margin-bottom: 20px ">Forgot Password?</a>
                <div class="form-group">
                    <input type="hidden" name="type" value="user" />
                </div>
                    <input type="submit" value="Login"/>
                    <input type="reset" value="Clear"/>
                
            </form>
                
            <a href="RegisterUser.jsp" class="col-md-12"> Create an account</a> 
           
         

        </div>
        <div class="col-md-12">
        <a href="AdminLogin.jsp" style="font-family: fantasy;color: white;font-size: 500%">Admin Login</a>|||||||||
            </div>
        <div class="col-md-12">
        
        <a href="MovieOperatorLogin.jsp"style="font-family: fantasy;color: white;font-size: 250%">Login as Committee member </a>
        </div>
    </div>
</div>
