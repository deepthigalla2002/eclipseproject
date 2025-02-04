package com.foodapp.model;

public class CartItem {
	private int item_id;
	private int restaurant_id;
	private String name;
	private int quantity;
	private double price;
	private double subtotal;
	
	
	public CartItem(int item_id, int restaurant_id, String name, int quantity, double price,double subtotal) {
		super();
		this.item_id = item_id;
		this.restaurant_id = restaurant_id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.subtotal=subtotal;
	}
	public CartItem() {
		super();
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	@Override
	public String toString() {
		return "CartItem [item_id=" + item_id + ", restaurant_id=" + restaurant_id + ", name=" + name + ", quantity="
				+ quantity + ", price=" + price + ", subtotal=" + subtotal + "]";
	}
	
	
}
