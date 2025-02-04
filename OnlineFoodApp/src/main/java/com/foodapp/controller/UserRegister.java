package com.foodapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.foodapp.DAOimpl.userDAOImpl;
import com.foodapp.dao.userDAO;
import com.foodapp.model.user;

/**
 * Servlet implementation class UserRegister
 */
@WebServlet("/signup")
public class UserRegister extends HttpServlet {
	private user user;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String phonenumber=req.getParameter("phonenumber");
		String address=req.getParameter("address");
		
		
		user user=new user();
		user.setUsername(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhonenumber(phonenumber);
        user.setAddress(address);
        
		userDAO userDAO=new userDAOImpl();
		int x=userDAO.addUser(user);
		if(x!=0)
		{
			resp.sendRedirect("success.jsp");
		}
		else
		{
			resp.sendRedirect("failure.jsp");
		}
		
		
	}

}
