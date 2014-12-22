<!DOCTYPE html>
<%@page import="com.emailinteractive.*"%>
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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>

<body>
	<div id ="div1" class="divOverlay"></div>
	<div class="content">
            <!-- The activator -->
            <a class="activator" id="activator"></a>
             <form id = "login2ndButton" action ="BeginLoginInitial" method ="get">
            	<a id="loginbutton" href='#' class='button'>Login</a>
         </form> 
            <p id = "usernameDisplay">${userEmailId}</p>
            
            <a id="helpButton" href='#' class='button'>Help</a>
        </div>
         
         
   
<h1 id ="sendEmailHeader">Send an Email</h1>	
<form  id ="formSendEmailId" action="SendMailSevlet" method="get">
	<input id ="fromEmailText" style="visibility:hidden" value =${userEmailId} type ="text" name="enterMail"/><br/>
	<input id ="passwordText"  style="visibility:hidden" value =${uPassW} type ="text" name="userPass"/>		
	<label id="toEmailLabel">Send To:</label>
	<input id ="toEmailText" type ="text" autocomplete="on" pattern="\b^[a-z0-9](\.?[a-z0-9]){5,}@g(oogle)?mail\.com$\b" title="Enter Gmail Address" name="enterToEmail" ${disableDestinationEmail}><br/>
	<label id="subjectLabel">Subject: </label>
	<input id ="subjectTextBox" type ="text" name="enterSubjectl" ${disableDestinationEmail}><br/>
	<label id="message">Enter Message:</label><br/>
	<textarea id ="textArea1" name="message" rows="4" cols="50" ${disableDestinationEmail}></textarea> 
	<input class="button" id ="sendMailButton" type="submit" onclick="return checkIfMailCanSend();"value="Send Email"/>	
</form>
	
	       <!-- The overlay and the box -->
<div class="overlay" id="overlay" style="display:none;"></div>
      
<div class="box" id="box">
    <div class="formBox" id ="formBox">
    <a class="boxclose" id="boxclose"></a>
	<%-- <c:out value="'${submitVal}'"></c:out> --%>
	
	<form id ="formLoginId" name ="loginForm" action="servlet1" method="get">
		<div class="form-title">
			<h2>Login to Gmail Account</h2>
		</div>
		<div class="form-title">Email</div>
		<!-- Only allows gmail email addresses -->
		<input class="form-field" id ="emailID" autocomplete="on" type="text" name="email" pattern="\b^[a-z0-9](\.?[a-z0-9]){5,}@g(oogle)?mail\.com$\b" title="Enter Gmail Address"/><br />
		<div class="form-title">Password</div>
		<input class="form-field" id ="passwordID" autocomplete="on" type="text" name="password" /><br />
		<p id ="invalidComboMessage" style="visibility:'${visableVal}'">**Invalid email/password combination**</p>
		<div class="submit-container">
		<input class="submit-button" id ="submitId" type="submit"  value="Submit" />
		</div>
	</form>
	</div>
</div>

<div class="box" id="box">
    <div class="formBox" id ="formBox2">
    <a class="boxclose" id="boxclose2"></a>
	<form >
		<div class="form-title">
			<h2 align="center">Help</h2>
		</div>
		<div class="form-title">
		<p align="center"><b>How to use this application</b></p>
		<ol>
 			<li>Press the <b>Login</b> button</li>
 			<li>Login to your <b>Gmail account</b></li>
 			<li>Send an email</li>
		</ol>  
		</div>
	</form>
	</div>
</div>

<!-- The JavaScript -->
<script type="text/javascript" src="jquery-1.3.2.js"></script>
  <script type="text/javascript">
        
        var s = '${userEmailId}';
    	var p = document.getElementById('toEmailText').value;
    	/*if user email id contains gmail user is valid*/
    	var gmailFound = s.indexOf("gmail.com") > -1; /* checks for valid gmail account */
    	/*if gmailFound = -1; invalid account;false*/
    	/*if gmailFound != -1; valid account; true*/
    	
      window.onload = function() {            
        	document.getElementById('invalidComboMessage').setAttribute('style','visibility:hidden');
        	if (gmailFound == false) //invalid
        		{
        		document.getElementById('submitId').readOnly = true;
        		document.getElementById('toEmailText').disabled = true;
    			document.getElementById('subjectTextBox').disabled = true;
    			document.getElementById('textArea1').disabled = true;
        		}
        	else{
        		document.getElementById('toEmailText').disabled = false;
    			document.getElementById('subjectTextBox').disabled = false;
    	 		document.getElementById('textArea1').disabled = false;
    	 		document.getElementById('sendMailButton').disabled = false;
        	}
        };

        function checkIfMailCanSend(){
        	if(document.getElementById('toEmailText').value=="" && gmailFound == false){
    			//login first
        		alert("Please login to your Gmail account to send an email");
        		return false;
        	}
        	else if (document.getElementById('toEmailText').value=="" && gmailFound == true)
        		{
        		alert("Enter a destination email address");
        		return false;	
        		}
        	else{
        		return true;
        	}
        	
        }
        
              $(function() {
                $('#activator').click(function(){
                    $('#overlay').fadeIn('fast',function(){
                        $('#box').animate({'top':'160px'},500);
                    });                    
                });
                
                /* Login Button function */
                $('#loginbutton').click(function(){
                    $('#overlay').fadeIn('fast',function(){
                        $('#formBox').animate({'top':'160px'},500);
                    });                    
                });

                $('#boxclose').click(function(){
                    $('#formBox').animate({'top':'-350px'},500,function(){
                        $('#overlay').fadeOut('fast');
                    });
                });
                
                
                $('#helpButton').click(function(){
                    $('#overlay').fadeIn('fast',function(){
                        $('#formBox2').animate({'top':'160px'},500);
                    });                    
                });
                
                $('#boxclose2').click(function(){
                    $('#formBox2').animate({'top':'-350px'},500,function(){
                        $('#overlay').fadeOut('fast');
                    });
                });
                
            });
        </script>
</body>
</html>