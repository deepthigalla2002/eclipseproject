package com.foodapp.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodapp.DAOimpl.userDAOImpl;
import com.foodapp.dao.userDAO;
import com.foodapp.model.user;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		userDAO userDAO=new userDAOImpl();
		user user=userDAO.getUser(email);
		
		if(password.equals(user.getPassword()))
		{
			HttpSession session=req.getSession();
			session.setAttribute("loggedInUser",user);
			resp.sendRedirect("RestaurantServlet");
		}
		else
		{
			resp.sendRedirect("failure.jsp");
		}
	}
}
