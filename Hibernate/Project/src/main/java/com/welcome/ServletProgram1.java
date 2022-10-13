package com.welcome;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/ServletProgram1")//annotation
public class ServletProgram1 extends HttpServlet {
	
	public void init() {} //lifecycle methods
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("-----Welcome to servlet programming----");
		}

	public void destroy() {}//lifecycle methods


}
