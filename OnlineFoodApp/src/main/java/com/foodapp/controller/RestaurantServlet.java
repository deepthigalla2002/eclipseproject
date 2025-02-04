package com.foodapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodapp.DAOimpl.restaurantDAOImpl;
import com.foodapp.dao.restaurantDAO;
import com.foodapp.model.restaurant;


@WebServlet("/RestaurantServlet")
public class RestaurantServlet extends HttpServlet {
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			restaurantDAO restaurantDAO=new restaurantDAOImpl();
			List<restaurant> restaurantlist=restaurantDAO.getAllrestaurants();
			HttpSession session=req.getSession();
			session.setAttribute("restaurantlist", restaurantlist);
			resp.sendRedirect("home.jsp");
		}

}
