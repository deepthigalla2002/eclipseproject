package com.foodapp.model;

public class restaurant {
	private int restaurant_id;
	private String name;
	private String cuisinetype;
	private int deliverytime;
	private String Address;
	private int Adminuser_id;
	private float rating;
	private boolean isActive;
	private String imgpath;
	
	
	public restaurant() {
		super();
	}
	
	

	public restaurant(int restaurant_id, String name, String cuisinetype, int deliverytime, String address,
			int adminuser_id, float rating) {
		super();
		this.restaurant_id = restaurant_id;
		this.name = name;
		this.cuisinetype = cuisinetype;
		this.deliverytime = deliverytime;
		Address = address;
		Adminuser_id = adminuser_id;
		this.rating = rating;
	}



	public restaurant(int restaurant_id, String name, String cuisinetype, int deliverytime, String address,
			int adminuser_id, float rating, boolean isActive, String imgpath) {
		super();
		this.restaurant_id = restaurant_id;
		this.name = name;
		this.cuisinetype = cuisinetype;
		this.deliverytime = deliverytime;
		Address = address;
		Adminuser_id = adminuser_id;
		this.rating = rating;
		this.isActive = isActive;
		this.imgpath = imgpath;
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


	public String getCuisinetype() {
		return cuisinetype;
	}


	public void setCuisinetype(String cuisinetype) {
		this.cuisinetype = cuisinetype;
	}


	public int getDeliverytime() {
		return deliverytime;
	}


	public  void setDeliverytime(int deliverytime) {
		this.deliverytime = deliverytime;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public int getAdminuser_id() {
		return Adminuser_id;
	}


	public void setAdminuser_id(int adminuser_id) {
		Adminuser_id = adminuser_id;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}


	public String getImgpath() {
		return imgpath;
	}


	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}


	@Override
	public String toString() {
		return "restaurant [restaurant_id=" + restaurant_id + ", name=" + name + ", cuisinetype=" + cuisinetype
				+ ", deliverytime=" + deliverytime + ", Address=" + Address + ", Adminuser_id=" + Adminuser_id
				+ ", rating=" + rating + ", isActive=" + isActive + ", imgpath=" + imgpath + "]";
	}
	
	  
	
	
}