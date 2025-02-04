package com.foodapp.model;

public class orderItem {
	int orderitem_id;
	int order_id;
	int menu_id;
	int quantity;
	float subtotal;
	
	public orderItem() {
		super();
	}

	public orderItem(int orderitem_id, int order_id, int menu_id, int quantity, float subtotal) {
		super();
		this.orderitem_id = orderitem_id;
		this.order_id = order_id;
		this.menu_id = menu_id;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	
	
	public orderItem(int order_id, int menu_id, int quantity, float subtotal) {
		super();
		this.order_id = order_id;
		this.menu_id = menu_id;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public int getOrderitem_id() {

		return orderitem_id;
	}
	

	public void setOrderitem_id(int orderitem_id) {

		this.orderitem_id = orderitem_id;
	}
	

	public int getOrder_id() {
		return order_id;
	}
	

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	

	public int getMenu_id() {
		return menu_id;
	}
	

	public void setMenu_id(int menu_id) 
	{
		this.menu_id = menu_id;
	}

	public int getQuantity() {
		return quantity;
	}
	

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	public float getSubtotal() {
		return subtotal;
	}
	

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	

	@Override
	public String toString() {
		return "OrderItem [orderitem_id=" + orderitem_id + ", order_id=" + order_id + ", menu_id=" + menu_id
				+ ", quantity=" + quantity + ", subtotal=" + subtotal + "]";
	}
	
	
}
