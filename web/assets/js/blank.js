//<script type="text/javascript" src="js/blank.js"></script></head>
//<form name="myForm" action="#" onsubmit="return validateDebitCard();" method="post" >

//login page
function validateLogin() {
	var bn = document.forms["myForm"]["busname"].value;
	var dc = document.forms["myForm"]["departurecity"].value;
	var ac = document.forms["myForm"]["arrivalcity"].value;
	var dt = document.forms["myForm"]["departuretime"].value;
	var tt = document.forms["myForm"]["traveltime"].value;
	var c = document.forms["myForm"]["cost"].value;
	var s = document.forms["myForm"]["seats"].value;
	var time = /^(?:2[0-3]|[01][0-9]):[0-5][0-9]$/;

	if (bn == "" || dc == "" || ac == "" || dt == "" || tt == "" || c == ""
			|| s == "") {
		alert('Fill all fields');

		return false;
	} else if (!dt.match(time) || !tt.match(time)) {
		alert("time format should be hh:mm");
		document.forms["myForm"]["departuretime"].style.borderColor = "red";
		return false;
	}
}

function validateLogin1() {
	var bon = document.forms["AddNewMovieOperatorFormController"]["busoperatorname"].value;
	var e = document.forms["AddNewMovieOperatorFormController"]["email"].value;
	var ad = document.forms["AddNewMovieOperatorFormController"]["address"].value;
	var ct = document.forms["AddNewMovieOperatorFormController"]["city"].value;
	var pn = document.forms["AddNewMovieOperatorFormController"]["phonenumber"].value;
	var pw = document.forms["AddNewMovieOperatorFormController"]["password"].value;
	var npw = document.forms["AddNewMovieOperatorFormController"]["newpassword"].value;
	var time = /^(?:2[0-3]|[01][0-9]):[0-5][0-9]$/;

	if (bon == "" || e == "" || ad == "" || ct == "" || pn == "" || pw == ""
			|| npw == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin2() {
	var un = document.forms["loginForm"]["username"].value;
	var pwd = document.forms["loginForm"]["password"].value;

	if (un == "" || pwd == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin3() {
	var nos = document.forms["bookTicket"]["noOfseats"].value;
	var e = document.forms["bookTicket"]["email"].value;
	var bid = document.forms["bookTicket"]["busid"].value;
	var dd = document.forms["bookTicket"]["deptdate"].value;

	var time = /^(?:2[0-3]|[01][0-9]):[0-5][0-9]$/;

	if (nos == "" || e == "" || bid == "" || dd == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin4() {
	var un = document.forms["loginForm"]["username"].value;
	var pwd = document.forms["loginForm"]["password"].value;

	if (un == "" || pwd == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin5() {
	var op = document.forms["ChangePasswordFormController"]["oldpassword"].value;
	var np = document.forms["ChangePasswordFormController"]["newpassword"].value;
	var cp = document.forms["ChangePasswordFormController"]["confirmpassword"].value;

	if (op == "" || np == "" || cp == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin6() {
	var pn = document.forms["deletebusoperator"]["phonenumber"].value;
	var pwd = document.forms["deletebusoperator"]["password"].value;

	if (pn == "" || pwd == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin7() {
	var pn = document.forms["deleteuser"]["phonenumber"].value;
	var pwd = document.forms["deleteuser"]["password"].value;

	if (pn == "" || pwd == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin8() {
	var bn = document.forms["EditMovieDetailsForm"]["busname"].value;
	var bt = document.forms["EditMovieDetailsForm"]["bustype"].value;
	var bt1 = document.forms["EditMovieDetailsForm"]["bustype1"].value;
	var dc = document.forms["EditMovieDetailsForm"]["departurecity"].value;
	var ac = document.forms["EditMovieDetailsForm"]["arrivalcity"].value;
	var dt = document.forms["EditMovieDetailsForm"]["departuretime"].value;
	var tt = document.forms["EditMovieDetailsForm"]["traveltime"].value;
	var od = document.forms["EditMovieDetailsForm"]["OperatingDays"].value;
	var c = document.forms["EditMovieDetailsForm"]["cost"].value;
	var nos = document.forms["EditMovieDetailsForm"]["noofseats"].value;
	var time = /^(?:2[0-3]|[01][0-9]):[0-5][0-9]$/;

	if (bn == "" || bt == "" || bt1 == "" || dc == "" || ac == "" || dt == ""
			|| tt == "" || od == "" || c == "" || nos == "") {
		alert('Fill all fields');

		return false;
	} else if (!dt.match(time) || !tt.match(time)) {
		alert("time format should be hh:mm");
		document.forms["myForm"]["departuretime"].style.borderColor = "red";
		return false;
	}
}

function validateLogin9() {
	var fn = document.forms["EditProfileFormController"]["firstname"].value;
	var ln = document.forms["EditProfileFormController"]["lastname"].value;
	var add = document.forms["EditProfileFormController"]["address"].value;
	var c = document.forms["EditProfileFormController"]["city"].value;
	var e = document.forms["EditProfileFormController"]["email"].value;
	var pn = document.forms["EditProfileFormController"]["phonenumber"].value;

	if (fn == "" || ln == "" || add == "" || c == "" || e == "" || pn == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin10() {
	var un = document.forms["ForgotPasswordController"]["username"].value;
	var sq = document.forms["ForgotPasswordController"]["secQstn"].value;
	var sa = document.forms["ForgotPasswordController"]["secAns"].value;

	if (un == "" || sq == "" || sa == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin11() {
	var b = document.forms["printTicketForm"]["booking"].value;

	if (b == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin12() {
	var f = document.forms["SearchMovieFormController"]["from"].value;
	var t = document.forms["SearchMovieFormController"]["to"].value;
	var d = document.forms["SearchMovieFormController"]["date"].value;

	if (f == "" || t == "" || d == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin13() {
	var e = document.forms["LoginFormController"]["email"].value;
	var p = document.forms["LoginFormController"]["password"].value;

	if (e == "" || p == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin14() {
	var u = document.forms["loginForm"]["username"].value;
	var p = document.forms["loginForm"]["password"].value;

	if (u == "" || p == "") {
		alert('Fill all fields');

		return false;
	}
}

function validateLogin15() {
	var u = document.forms["RegisterUserController"]["username"].value;
	var p = document.forms["RegisterUserController"]["password"].value;
	var cp = document.forms["RegisterUserController"]["confirmPassword"].value;
	var fn = document.forms["RegisterUserController"]["fName"].value;
	var ln = document.forms["RegisterUserController"]["lName"].value;
	var c = document.forms["RegisterUserController"]["city"].value;
	var add = document.forms["RegisterUserController"]["address"].value;
	var pn = document.forms["RegisterUserController"]["phoneNumber"].value;

	if (u == "" || p == "" || cp == "" || fn == "" || ln == "" || c == ""
			|| add == "" || pn == "") {
		alert('Fill all fields');

		return false;
	}

	function cancelBack() {
		if ((event.keyCode == 8 || (event.keyCode == 37 && event.altKey) || (event.keyCode == 39 && event.altKey))
				&& (event.srcElement.form == null || event.srcElement.isTextEdit == false)) {
			alert("invalid request");
			event.cancelBubble = true;
			event.returnValue = false;
		}
	}

	window.onload = function() {
		noBack();
	}
	window.history.forward();
	function noBack() {
		window.history.forward();
	}

}