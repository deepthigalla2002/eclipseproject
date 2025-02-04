package com.foodapp.model;

public class orderTable {
	int order_id;
	int restaurant_id;
	int user_id;
	float totalAmount;
	String status;
	String paymentmode;
	int orderdate;
	
	public orderTable() {
		super();
	}

	public orderTable(int order_id, int restaurant_id, int user_id, float totalAmount, String status,
			String paymentmode, int orderdate) {
		super();
		this.order_id = order_id;
		this.restaurant_id = restaurant_id;
		this.user_id = user_id;
		this.totalAmount = totalAmount;
		this.status = status;
		this.paymentmode = paymentmode;
		this.orderdate = orderdate;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public int getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(int orderdate) {
		this.orderdate = orderdate;
	}

	@Override
	public String toString() {
		return "OrderTable [order_id=" + order_id + ", restaurant_id=" + restaurant_id + ", user_id=" + user_id
				+ ", totalAmount=" + totalAmount + ", status=" + status + ", paymentmode=" + paymentmode
				+ ", orderdate=" + orderdate + "]";
	}
	
	
	
}
