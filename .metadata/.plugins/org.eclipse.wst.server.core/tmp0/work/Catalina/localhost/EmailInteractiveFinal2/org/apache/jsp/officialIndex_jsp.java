/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2014-12-22 23:12:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.emailinteractive.*;

public final class officialIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<title>Email Interactive</title>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styleOverlay.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/helpButtonStyle.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/sendEmailButtonStyle.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/loginButtonStyle.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/overlayLoginForm.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/overlayFormStyle.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id =\"div1\" class=\"divOverlay\"></div>\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("            <!-- The activator -->\r\n");
      out.write("            <a class=\"activator\" id=\"activator\"></a>\r\n");
      out.write("             <form id = \"login2ndButton\" action =\"BeginLoginInitial\" method =\"get\">\r\n");
      out.write("            \t<a id=\"loginbutton\" href='#' class='button'>Login</a>\r\n");
      out.write("         </form> \r\n");
      out.write("            <p id = \"usernameDisplay\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userEmailId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("            \r\n");
      out.write("            <a id=\"helpButton\" href='#' class='button'>Help</a>\r\n");
      out.write("        </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("   \r\n");
      out.write("<h1 id =\"sendEmailHeader\">Send an Email</h1>\t\r\n");
      out.write("<form  id =\"formSendEmailId\" action=\"SendMailSevlet\" method=\"get\">\r\n");
      out.write("\t<input id =\"fromEmailText\" style=\"visibility:hidden\" value =");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userEmailId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" type =\"text\" name=\"enterMail\"/><br/>\r\n");
      out.write("\t<input id =\"passwordText\"  style=\"visibility:hidden\" value =");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uPassW}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" type =\"text\" name=\"userPass\"/>\t\t\r\n");
      out.write("\t<label id=\"toEmailLabel\">Send To:</label>\r\n");
      out.write("\t<input id =\"toEmailText\" type =\"text\" autocomplete=\"on\" pattern=\"\\b^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$\\b\" title=\"Enter Gmail Address\" name=\"enterToEmail\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${disableDestinationEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("><br/>\r\n");
      out.write("\t<label id=\"subjectLabel\">Subject: </label>\r\n");
      out.write("\t<input id =\"subjectTextBox\" type =\"text\" autocomplete=\"on\" name=\"enterSubjectl\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${disableDestinationEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("><br/>\r\n");
      out.write("\t<label id=\"message\">Enter Message:</label><br/>\r\n");
      out.write("\t<textarea id =\"textArea1\" name=\"message\" rows=\"4\" cols=\"50\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${disableDestinationEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("></textarea> \r\n");
      out.write("\t<input class=\"button\" id =\"sendMailButton\" type=\"submit\" onclick=\"return checkIfMailCanSend();\"value=\"Send Email\"/>\t\r\n");
      out.write("</form>\r\n");
      out.write("\t\r\n");
      out.write("\t       <!-- The overlay and the box -->\r\n");
      out.write("<div class=\"overlay\" id=\"overlay\" style=\"display:none;\"></div>\r\n");
      out.write("      \r\n");
      out.write("<div class=\"box\" id=\"box\">\r\n");
      out.write("    <div class=\"formBox\" id =\"formBox\">\r\n");
      out.write("    <a class=\"boxclose\" id=\"boxclose\"></a>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<form id =\"formLoginId\" name =\"loginForm\" action=\"servlet1\" method=\"get\">\r\n");
      out.write("\t\t<div class=\"form-title\">\r\n");
      out.write("\t\t\t<h2>Login to Gmail Account</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-title\">Email</div>\r\n");
      out.write("\t\t<!-- Only allows gmail email addresses -->\r\n");
      out.write("\t\t<input class=\"form-field\" id =\"emailID\" autocomplete=\"off\" type=\"text\" name=\"email\" pattern=\"\\b^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$\\b\" title=\"Enter Gmail Address\"/><br />\r\n");
      out.write("\t\t<div class=\"form-title\">Password</div>\r\n");
      out.write("\t\t<input class=\"form-field\" id =\"passwordID\" autocomplete=\"off\" type=\"password\" name=\"password\" /><br />\r\n");
      out.write("\t\t<p id =\"invalidComboMessage\" style=\"visibility:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${visableVal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("'\">**Invalid email/password combination**</p>\r\n");
      out.write("\t\t<div class=\"submit-container\">\r\n");
      out.write("\t\t<input class=\"submit-button\" id =\"submitId\" type=\"submit\"  value=\"Submit\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"box\" id=\"box\">\r\n");
      out.write("    <div class=\"formBox\" id =\"formBox2\">\r\n");
      out.write("    <a class=\"boxclose\" id=\"boxclose2\"></a>\r\n");
      out.write("\t<form >\r\n");
      out.write("\t\t<div class=\"form-title\">\r\n");
      out.write("\t\t\t<h2 align=\"center\">Help</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-title\">\r\n");
      out.write("\t\t<p align=\"center\"><b>How to use this application</b></p>\r\n");
      out.write("\t\t<ol>\r\n");
      out.write(" \t\t\t<li>Press the <b>Login</b> button</li>\r\n");
      out.write(" \t\t\t<li>Login to your <b>Gmail account</b></li>\r\n");
      out.write(" \t\t\t<li>Send an email</li>\r\n");
      out.write("\t\t</ol>  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- The JavaScript -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-1.3.2.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("        \r\n");
      out.write("        var s = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userEmailId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("    \tvar p = document.getElementById('toEmailText').value;\r\n");
      out.write("    \t/*if user email id contains gmail user is valid*/\r\n");
      out.write("    \tvar gmailFound = s.indexOf(\"gmail.com\") > -1; /* checks for valid gmail account */\r\n");
      out.write("    \t/*if gmailFound = -1; invalid account;false*/\r\n");
      out.write("    \t/*if gmailFound != -1; valid account; true*/\r\n");
      out.write("    \t\r\n");
      out.write("      window.onload = function() {            \r\n");
      out.write("        \tdocument.getElementById('invalidComboMessage').setAttribute('style','visibility:hidden');\r\n");
      out.write("        \tif (gmailFound == false) //invalid\r\n");
      out.write("        \t\t{\r\n");
      out.write("        \t\tdocument.getElementById('submitId').readOnly = true;\r\n");
      out.write("        \t\tdocument.getElementById('toEmailText').disabled = true;\r\n");
      out.write("    \t\t\tdocument.getElementById('subjectTextBox').disabled = true;\r\n");
      out.write("    \t\t\tdocument.getElementById('textArea1').disabled = true;\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \telse{\r\n");
      out.write("        \t\tdocument.getElementById('toEmailText').disabled = false;\r\n");
      out.write("    \t\t\tdocument.getElementById('subjectTextBox').disabled = false;\r\n");
      out.write("    \t \t\tdocument.getElementById('textArea1').disabled = false;\r\n");
      out.write("    \t \t\tdocument.getElementById('sendMailButton').disabled = false;\r\n");
      out.write("        \t}\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        function checkIfMailCanSend(){\r\n");
      out.write("        \tif(document.getElementById('toEmailText').value==\"\" && gmailFound == false){\r\n");
      out.write("    \t\t\t//login first\r\n");
      out.write("        \t\talert(\"Please login to your Gmail account to send an email\");\r\n");
      out.write("        \t\treturn false;\r\n");
      out.write("        \t}\r\n");
      out.write("        \telse if (document.getElementById('toEmailText').value==\"\" && gmailFound == true)\r\n");
      out.write("        \t\t{\r\n");
      out.write("        \t\talert(\"Enter a destination email address\");\r\n");
      out.write("        \t\treturn false;\t\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \telse{\r\n");
      out.write("        \t\treturn true;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("              $(function() {\r\n");
      out.write("                $('#activator').click(function(){\r\n");
      out.write("                    $('#overlay').fadeIn('fast',function(){\r\n");
      out.write("                        $('#box').animate({'top':'160px'},500);\r\n");
      out.write("                    });                    \r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("                /* Login Button function */\r\n");
      out.write("                $('#loginbutton').click(function(){\r\n");
      out.write("                    $('#overlay').fadeIn('fast',function(){\r\n");
      out.write("                        $('#formBox').animate({'top':'160px'},500);\r\n");
      out.write("                    });                    \r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('#boxclose').click(function(){\r\n");
      out.write("                    $('#formBox').animate({'top':'-350px'},500,function(){\r\n");
      out.write("                        $('#overlay').fadeOut('fast');\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                $('#helpButton').click(function(){\r\n");
      out.write("                    $('#overlay').fadeIn('fast',function(){\r\n");
      out.write("                        $('#formBox2').animate({'top':'160px'},500);\r\n");
      out.write("                    });                    \r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("                $('#boxclose2').click(function(){\r\n");
      out.write("                    $('#formBox2').animate({'top':'-350px'},500,function(){\r\n");
      out.write("                        $('#overlay').fadeOut('fast');\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
