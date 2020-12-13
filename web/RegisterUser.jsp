<%@page import="com.cognizant.model.MovieModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>

<!-- ***********   START   *********** -->
<script type="text/javascript" src="assets/js/blank.js"></script>

<link rel="stylesheet" href="assets/css/registration.css" type="text/css" media="screen" />
<title>Registration</title>

<div class="container">
    <div class="regbox box">
        
        <h1 class="h1">REGISTER FORM</h1>
        
        <!--User Registration-->
        <form name="RegisterUserController" action="RegisterUserController"
              onsubmit="return validateLogin15();" method="post">


            <input type="text" name="username" placeholder="Email ID"/>
            <input type="password" name="password" placeholder="Password"/>
            <input type="password" name="confirmPassword" placeholder="Confirm Password"/>
            <input type="text" name="fName" placeholder="First Name"/>
            <input type="text" name="lName" placeholder="Last Name"/>
            <input type="text" name="city" placeholder="City"/>
            <input type="text" name="address" placeholder="Address">
            <input type="text" name="phoneNumber" placeholder="Phone Number"/>
            <label for="sq">Security Question</label>
            <select name="sq" id="sq" c>
                <option value="What was the name of your elementary / primary school?">What was the name of your elementary / primary school?</option>
                <option value="What was your favorite place to visit as a child?">What was your favorite place to visit as a child?</option>
                <option value="What month were you born?">What month were you born?</option>
            </select>

            <input type="text" name="sa" placeholder="Security Answer"/>
            <input type="submit" value="Create Account"/>


            <input type="reset" value="Clear"/>
        </form>   
        <div class="errordiv col-lg-10 col-md-10 col-sm-10 col-xs-10">
            <%
                String msg = request.getParameter("msg");
                if (msg != null) {
                    out.print(msg);
                }
            %>
        </div>
    </div>

</div>


<!-- ********************************* -->