<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration-Form</title>
</head>
<body>
	<fieldset>
		<legend>SelectCourse</legend>
		<form action="./Registrationhcl" method="post">
			<table>
				<tr>
					<td><label>First Name:</label></td>
					<td><input type="text" name="fname" required></td>
				</tr>
				<tr>
					<td><label>Last Name:</label></td>
					<td><input type="text" name="lname" required></td>
				</tr>
				<tr>
					<td><label>Phone Number:</label>
					<td><input type="tel" name="phone" pattern="[6-9][0-9]{9}"
						required></td>
				</tr>
				<tr>
					<td><label>Email:</label></td>
					<td><input type="email" name="email" required></td>
				</tr>
				<tr>
					<td><label>Language</label></td>
					
					<td><input type="checkbox" id="c" name="x" value="c">
						<label for="c">C</label><br>
						
						<input type="checkbox" id="c++" name="x" value="c++"> 
						<label for="c++">C++</label><br>
						
						<input type="checkbox" id="java" name="x" value="java"> <label
						for="java">Java</label><br></td>
				</tr>
				<tr>
					<td><input type="submit" value="register" name=register></td>
					<td><input type="reset"></td>
				</tr>


			</table>


		</form>
	</fieldset>


</body>
</html>