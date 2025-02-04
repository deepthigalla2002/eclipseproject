<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.foodapp.model.user, java.util.List, com.foodapp.model.restaurant"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }
    .welcome {
        background-color: #4CAF50;
        color: white;
        padding: 15px;
        text-align: center;
    }
    .welcome h3 {
        margin: 0;
    }
    .welcome a {
        color: white;
        text-decoration: none;
        margin: 0 10px;
        font-weight: bold;
    }
    .welcome a:hover {
        text-decoration: underline;
    }
    h2 {
        text-align: center;
        color: #333;
    }
    .restaurant-card {
        background-color: white;
        border: 1px solid #ddd;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        margin: 20px;
        padding: 15px;
        text-align: center;
    }
    .restaurant-card h3 {
        margin: 0 0 10px 0;
    }
    .restaurant-card p {
        margin: 0 0 10px 0;
    }
    .restaurant-card a {
        color: #4CAF50;
        text-decoration: none;
        font-weight: bold;
    }
    .restaurant-card a:hover {
        text-decoration: underline;
    }
    .action-links {
        text-align: center;
        margin: 20px;
    }
    .action-links a {
        color: blue;
        text-decoration: none;
        margin: 0 10px;
        font-weight: bold;
    }
    .action-links a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>

<% user user = (user)session.getAttribute("loggedInUser"); %>
	
<% if(user != null) { %>
    <div class="welcome">
    <center>
        <h3>Welcome, To Tap Foods <% out.println(user.getUsername()); %></h3>
      </center>
        <div class="action-links">
            <a href="cart">View Cart</a>
            <a href="OrderHistory">View Order History</a>
            <a href="logout">Logout</a>
        </div>
    </div>
<% } %>

<% if(user == null) { %>
    <div class="action-links">
        <a href="login.jsp">Login</a>
        <a href="register.jsp">Register</a>
    </div>
<% } %>

<h2>Featured Restaurants</h2>

<% 
List<restaurant> restaurantlist = (List<restaurant>) session.getAttribute("restaurantlist");
if(restaurantlist != null) {
    for(restaurant restaurant : restaurantlist) {
%>

    <div class="restaurant-card">
        <h3><%= restaurant.getName() %></h3>
        <p>Cuisine: <%= restaurant.getCuisinetype() %><br>
        Delivery Time: <%= restaurant.getDeliverytime() %> mins</p>
        <a href="MenuServlet?restaurant_id=<%= restaurant.getRestaurant_id() %>">View Menu</a>
    </div>

<%
    }
}
%>

</body>
</html>
