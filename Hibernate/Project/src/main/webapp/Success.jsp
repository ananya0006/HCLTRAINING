
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body bgcolor="cyan">
	<form method=post>
		<h3>Registered Successfully</h3>
		<label>choose language to view details:</label> <select
			name="language">

			<option value="C">C</option>
			<option value="C++">C++</option>
			<option value="Java">Java</option>
			<option value="Any">Any language</option>
		</select><br> <input type="submit" value="click here">
	</form>

	<%
	//response.setHeader("cache-control","no-cache,no-store,must-revalidate");
	String language = request.getParameter("language");
	if (language != null) {
	%>
	<table>
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Phone Number</td>
			<td>Email Id</td>
			<td>Languages</td>
		<tr>
			<%
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ananya", "root", "Anrura06");
				ResultSet rs = null;
				if (language.equals("Any")) {
					PreparedStatement ps = con.prepareStatement(
					"select r.firstName,r.lastName,r.phoneNumber,r.Email,l.language from register r,language l where r.Email = l.Email  ");
					rs = ps.executeQuery();
				} else {
					PreparedStatement ps1 = con.prepareStatement(
					"select r.firstName,r.lastName,r.phoneNumber,r.Email,l.language from register r,language l where r.Email = l.Email and l.language = ?");
					ps1.setString(1, language);
					rs = ps1.executeQuery();
				}
			%>
			<%
			while (rs.next()) {
			%>
		
		<tr>
			<td><%=rs.getString("FirstName")%></td>
			<td><%=rs.getString("lastName")%></td>
			<td><%=rs.getString("phoneNumber")%></td>
			<td><%=rs.getString("Email")%></td>
			<td><%=rs.getString("language")%></td>
		</tr>
		<%
		}
		%>
		<%
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}

		}
		%>
	</table>
	<%
	//response.setHeader("cache-control","no-cache,no-store,must-revalidate");
	%>
</body>
</html>
