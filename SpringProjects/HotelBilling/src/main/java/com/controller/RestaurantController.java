package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RestaurantDao;
import com.dto.Restaurant;
@WebServlet("/Restaurant")
public class RestaurantController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		
		String FoodName=req.getParameter("FoodName");
		double FoodPrice=Double.parseDouble(req.getParameter("FoodPrice"));
		int  FoodQuantity=Integer.parseInt(req.getParameter("FoodQuantity"));
		Restaurant r=new Restaurant();
		double FinalPrice=FoodPrice * FoodQuantity;
		r.setFoodName(FoodName);
		r.setFoodPrice(FoodPrice);
		r.setFoodQuantity(FoodQuantity);
		r.setFinalPrice(FinalPrice);
		RestaurantDao d=new RestaurantDao();
		d.saveFood(r);
		PrintWriter printWriter=res.getWriter();
		printWriter.write("<html><body><h1>DATA INSERTED SUCCESSFULLY</h1></body></html>");
		RequestDispatcher dispatcher =req.getRequestDispatcher("index.jsp");
		dispatcher.include(req, res);

}
}
