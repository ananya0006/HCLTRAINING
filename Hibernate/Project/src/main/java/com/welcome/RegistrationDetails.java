package com.welcome;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationDetails")
public class RegistrationDetails extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getParameter("FirstName");
		request.getParameter("LastName");
		request.getParameter("PhoneNo");
		request.getParameter("Email");
		String e = request.getParameter("Language");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ananya", "root",
					"Anrura06");

			PreparedStatement ps = ((java.sql.Connection) con)
					.prepareStatement("select * from members where Language=(?)");

			ps.setString(1, e);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String FirstName = request.getParameter("FirstName");
				String LastName = request.getParameter("LastName");
				String PhoneNo = request.getParameter("PhoneNo");
				String Email = request.getParameter("Email");
				String Language = request.getParameter("Language");

				out.print(FirstName + ", " + LastName + ", " + PhoneNo + ", " + Email + ", " + Language);

			}
		}

		catch (Exception e2) {
			e2.printStackTrace();
		}
		out.close();
	}
}
