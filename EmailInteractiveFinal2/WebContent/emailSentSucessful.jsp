<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Email Interactive</title>

<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/styleOverlay.css">
<link rel="stylesheet" type="text/css" href="css/helpButtonStyle.css">
<link rel="stylesheet" type="text/css" href="css/sendEmailButtonStyle.css">
<link rel="stylesheet" type="text/css" href="css/loginButtonStyle.css">
<link rel="stylesheet" type="text/css" href="css/overlayLoginForm.css">
<link rel="stylesheet" type="text/css" href="css/overlayFormStyle.css">
<link rel="stylesheet" type="text/css" href="css/emailSentStyle.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

</head>
<body>
	<h1 id ="sucessfulSendId">Email Sent Sucessfully</h1>
	<img id ="emailSentPicId"src="email_sent.png" alt="Mountain View" style="width:304px;height:228px">
	<a href='#' id ="sendAnotherEmailButton" type ="submit" class='button' onclick="history.go(-1);return true;">Send Another Email</a>
</body>
</html>