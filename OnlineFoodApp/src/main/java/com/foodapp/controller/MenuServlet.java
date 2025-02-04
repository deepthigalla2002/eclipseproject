
package com.foodapp.controller;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.foodapp.DAOimpl.menuDAOImpl;
import com.foodapp.dao.menuDAO;
import com.foodapp.model.menu;


@WebServlet("/MenuServlet")
public class MenuServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String restaurant_id=req.getParameter("restaurant_id");
		
		menuDAO menuDAO=new menuDAOImpl();
		ArrayList<menu> menulist = menuDAO.getAllMenu();
		//System.out.println("Menu List: " + menulist);

		if(menulist!=null)
		{
			HttpSession session=req.getSession();

			session.setAttribute("Menulist",menulist);
			resp.sendRedirect("menu.jsp");
		}
		else
		{
			resp.sendRedirect("failure.jsp");
		}
	
	}
}
