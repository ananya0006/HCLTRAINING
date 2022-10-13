package com.welcome;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/pqr")//annotation
public class First extends GenericServlet{
	
	
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		pw.print("<html><body>");
		pw.print("<b>-----Hello Generic Servlet----</b>");
		pw.print("</body></html>");
		}



}
