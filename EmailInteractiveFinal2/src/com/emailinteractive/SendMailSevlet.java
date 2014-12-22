package com.emailinteractive;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendMailSevlet
 */

public class SendMailSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 /*
		  * Set attributes pulled in from view to be sent
		  * and prepare them to be passed into method parameter
		  */
		request.setAttribute("enterMail", request.getParameter("enterMail"));
		request.setAttribute("userPass", request.getParameter("userPass"));
		
		request.setAttribute("enterToEmail", request.getParameter("enterToEmail")); //destination email
		request.setAttribute("enterSubjectl", request.getParameter("enterSubjectl")); //email subject
		request.setAttribute("message", request.getParameter("message"));
		
		final String email = request.getParameter("enterMail");
		final String password = request.getParameter("userPass");
		final String destinationAddress = request.getParameter("enterToEmail");
		final String subject = request.getParameter("enterSubjectl");
		final String message = request.getParameter("message");
		
		 
		//send each of the values entered by the user to sendRealEmail method preparing
		//the email to be sent
		EmailAction ea = new EmailAction();
		ea.sendRealEmail(email,password,destinationAddress,subject,message,request,response);
		
		//request.getRequestDispatcher("emailSentSucessful.jsp").forward(request, response);	
	}

}
