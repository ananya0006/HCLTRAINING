package com.welcome;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registration2")

public class registration2 extends HttpServlet {

public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
int a=Integer.parseInt(request.getParameter("id"));
String b=request.getParameter("first_name");
String c=request.getParameter("last_name");
String d=request.getParameter("username");
String e=request.getParameter("password");
String f=request.getParameter("address");
String g=request.getParameter("contact");
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Ananya","root","Anrura06");

PreparedStatement ps=((java.sql.Connection) con).prepareStatement("insert into employee values(?,?,?,?,?,?,?)");

ps.setInt(1, a);
ps.setString(2, b);
ps.setString(3, c);
ps.setString(4, d);
ps.setString(5, e);
ps.setString(6, f);
ps.setString(7, g);


int i=ps.executeUpdate();  
if(i>0)
{
out.print("You are successfully registered...");

RequestDispatcher rd=request.getRequestDispatcher("llogin.html");
rd.forward(request,response);


}
else
{
	out.print("Duplicate entry or invalid entry...!");
}
}

catch (Exception e2)
{
e2.printStackTrace();
}  

out.close();   
}}

