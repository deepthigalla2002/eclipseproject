<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.foodapp.model.Cart,com.foodapp.model.CartItem, java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Cart</title>
</head>
<body>

	<%
    Cart cartitem = (Cart) session.getAttribute("cart");
		if(cartitem!=null  && !cartitem.getAll().isEmpty()){	
			 for (CartItem item :cartitem.getAll().values()) {
		 
	%>
       		 <h3>Item: <%= item.getName() %></h3>
             Price:<%= item.getPrice() %>
            Quantity: <%= item.getQuantity() %>
            Subtotal:<%= item.getPrice() * item.getQuantity() %>
            <form action="cart" method="post">
          
                <input type="hidden" name="itemId" value="<%= item.getItem_id() %>">
                <input type="hidden" name="action" value="update">
            
                Quantity: <input type="number" name="quantity" value="<%= item.getQuantity() %>" min="1">
                <button type="submit">Update</button>
                
                 <input type="hidden" name="itemId" value="<%= item.getItem_id() %>">
                <input type="hidden" name="action" value="remove">
                <button type="submit">Delete</button>
            </form>
   
        <%
            }
        %>
  
    <%
        } else {
    %>
    <p>Your cart is empty.</p>
    <%
        }
    %>
</body>
</html>