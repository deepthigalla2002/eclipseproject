package com.foodapp.model;

public class orderHistory {
	int orderhistory_id;
	int order_id;
	int user_id;
	int order_date;
	float totalAmount;
	String status;
	
	
	public orderHistory() {
		super();
	}


	public orderHistory(int orderhistory_id, int order_id, int user_id, int order_date, float totalAmount,String status) 
	{
		super();
		this.orderhistory_id = orderhistory_id;
		this.order_id = order_id;
		this.user_id = user_id;
		this.order_date = order_date;
		this.totalAmount = totalAmount;
		this.status = status;
	}

	public orderHistory(int order_id, int user_id, int order_date, float totalAmount,String status) 
	{
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.order_date = order_date;
		this.totalAmount = totalAmount;
		this.status = status;
	}

	public int getOrderhistory_id() {
		return orderhistory_id;
	}


	public void setOrderhistory_id(int orderhistory_id) {
		this.orderhistory_id = orderhistory_id;
	}


	public int getOrder_id() {
		return order_id;
	}


	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getOrder_date() {
		return order_date;
	}


	public void setOrder_date(int order_date) {
		this.order_date = order_date;
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


	@Override
	public String toString() {
		return "OrderHistory [orderhistory_id=" + orderhistory_id + ", order_id=" + order_id + ", user_id=" + user_id
				+ ", order_date=" + order_date + ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}
	
	
	
}
