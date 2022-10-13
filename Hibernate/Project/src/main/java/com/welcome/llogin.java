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

@WebServlet("/llogin")
public class llogin extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int a = Integer.parseInt(request.getParameter("id"));
		String b = request.getParameter("username");
		String c = request.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ananya", "root",
					"Anrura06");

			PreparedStatement ps = ((java.sql.Connection) con)
					.prepareStatement("select * from employee where id=(?) and username=(?) and password=(?)");

			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setString(3, c);

			ResultSet rs = ps.executeQuery();
			if (rs.next())
				out.print("You are logged in successfully");
			else
				out.print("you are not the user please register");

		}

		catch (Exception e2) {
			e2.printStackTrace();
		}
		out.close();
	}
}
