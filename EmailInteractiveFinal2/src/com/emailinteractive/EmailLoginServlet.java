package com.emailinteractive;

import java.io.IOException;
import javax.mail.AuthenticationFailedException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class EmailLoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//Login values
        req.setAttribute("email", req.getParameter("email"));
        req.setAttribute("password", req.getParameter("password"));
        
		// holds the IP passed in by user/ this is also the from address
		final String emailId = req.getParameter("email");
		final String password = req.getParameter("password");
		
		//add code to check email and password combination entered by user
		EmailAction ea = new EmailAction();
		try {
			ea.checkActiveEmail(emailId, password, req,resp); /*if active email is detected*/
		} catch (AuthenticationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}
}
