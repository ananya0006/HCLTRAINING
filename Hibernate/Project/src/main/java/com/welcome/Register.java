package com.welcome;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")

public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String a = request.getParameter("FirstName");
		String b = request.getParameter("LastName");
		String c = request.getParameter("PhoneNo");
		String d = request.getParameter("Email");
		String e = request.getParameter("Language");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ananya", "root",
					"Anrura06");

			PreparedStatement ps = ((java.sql.Connection) con)
					.prepareStatement("insert into members values(?,?,?,?,?)");

			ps.setString(1, a);
			ps.setString(2, b);
			ps.setString(3, c);
			ps.setString(4, d);
			ps.setString(5, e);

			int i = ps.executeUpdate();
			if (i < 0) {
//out.println("You are successfully registered...!");

				RequestDispatcher rd = request.getRequestDispatcher("Error.html");
				rd.forward(request, response);

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("RegistrationDetails.html");
				rd.forward(request, response);
				// out.println("Duplicate entry or invalid entry or Empty fields...!");
			}
		}

		catch (Exception e2) {
			e2.printStackTrace();
		}

		out.close();
	}
}
