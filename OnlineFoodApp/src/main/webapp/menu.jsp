<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.foodapp.model.menu, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }
    h3 {
        color: #333;
    }
    .menu-item {
        background-color: white;
        border: 1px solid #ddd;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        margin: 20px auto;
        padding: 15px;
        max-width: 600px;
        text-align: center;
    }
    .menu-item img {
        max-width: 100%;
        height: auto;
        border-radius: 5px;
    }
    .menu-item p {
        margin: 10px 0;
    }
    .menu-item .available {
        font-weight: bold;
        color: #4CAF50;
    }
    .menu-item .not-available {
        font-weight: bold;
        color: #f44336;
    }
</style>
</head>
<body>

<% 
    List<menu> menulist = (List<menu>) session.getAttribute("Menulist");
    if(menulist != null ) {
        for(menu Menu : menulist) {       
%>

    <div class="menu-item">
        <h3><%= Menu.getMenuName() %></h3>
        <p>Price: $<%= Menu.getPrice() %></p>
        <p>Description: <%= Menu.getDescription() %></p>
        <img src="<%= Menu.getImgpath() %>" alt="Menu Image" />
        <p class="<%= Menu.getIsAvailable() ? "available" : "not-available" %>">
            Available: <%= Menu.getIsAvailable() ? "Yes" : "NO"%>
        </p>
        <form action="cart" method="post">
        	<input type="hidden" name="itemId" value="<%=Menu.getMenu_id() %>">
			Quantity:  <input type="number" name="quantity" value="1" min="1">
			         	<input type="submit" value="Add to Cart">
			        	<input type="hidden"  name="action" value="add">
				 
			        	
        
        </form>
        
    </div>

<%
        } 
    }
%>

</body>
</html>
