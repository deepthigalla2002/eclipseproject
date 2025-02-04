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
import com.foodapp.model.Cart;
import com.foodapp.model.CartItem;
import com.foodapp.model.menu;


@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession();
		Cart cart=(Cart) session.getAttribute("cart");
		if(cart==null)
		{
			cart=new Cart();
			session.setAttribute("cart",cart);		
			
		}
		
		String action=request.getParameter("action");
		if("add".equals(action))
		{
			addItemToCart(request,cart,session);
		}
		else if("update".equals(action))
		{
			updateCartItem(request,cart,session);
		}
		else if("remove".equals(action))
		{
			removeItemFromCart(request,cart,session);
		}
		
		
		session.setAttribute("cart", cart);
		response.sendRedirect("cart.jsp");
		
	}

	private void removeItemFromCart(HttpServletRequest request, Cart cart,HttpSession session) {
		// TODO Auto-generated method stub
		int itemId=Integer.parseInt(request.getParameter("itemId"));

		cart.clearCart(itemId);
		session.setAttribute("cart", cart);
	}

	private void updateCartItem(HttpServletRequest request, Cart cart,HttpSession session) {
		// TODO Auto-generated method stub
		int itemId = Integer.parseInt(request.getParameter("itemId"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		cart.updateItem(itemId, quantity);
		session.setAttribute("cart", cart);

	}

	private void addItemToCart(HttpServletRequest request, Cart cart,HttpSession session) {
		int itemId=Integer.parseInt(request.getParameter("itemId"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		
		menuDAO menuDAO=new menuDAOImpl();
		menu menuItem=menuDAO.getSpecificMenu(itemId);
//	    System.out.println("Adding item to cart - itemId: " + itemId + ", quantity: " + quantity);

		if(menuItem!=null)
		{
			CartItem item=new CartItem(
			menuItem.getMenu_id(),
			menuItem.getRestaurant_id(),
			menuItem.getMenuName(),
			quantity,
			menuItem.getPrice(),
			quantity*menuItem.getPrice());
			cart.addItem(item);
//	        System.out.println("Item added to cart: " + item.getName());

		}
		session.setAttribute("cart", cart);

	}

}
