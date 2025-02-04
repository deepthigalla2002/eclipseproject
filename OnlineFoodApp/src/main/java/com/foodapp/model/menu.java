package com.foodapp.model;

public class menu {
	private int menu_id;
	private int restaurant_id;
	private String menuName;
	private int price;
	private String description;
	private String imgpath;
	private boolean isAvailable;
	
	public menu() 
	{
		super();
	}
	
	public menu(int menu_id, int restaurant_id,String menuName, int price, String description) {
		super();
		this.menu_id = menu_id;
		this.restaurant_id = restaurant_id;
		this.menuName=menuName;
		this.price = price;
		this.description = description;
	}

	public menu(int menu_id, int restaurant_id,String menuName, int price, String description, String imgpath, boolean isAvailable) 
	{
		super();
		this.menu_id = menu_id;
		this.restaurant_id = restaurant_id;
		this.menuName=menuName;
		this.price = price;
		this.description = description;
		this.imgpath = imgpath;
		this.isAvailable = isAvailable;
	}
	public menu(int restaurant_id,String menuName, int price, String description, String imgpath, boolean isAvailable) 
	{
		super();
		this.restaurant_id = restaurant_id;
		this.menuName=menuName;
		this.price = price;
		this.description = description;
		this.imgpath = imgpath;
		this.isAvailable = isAvailable;
	}
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public int getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	
	


	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "menu [menu_id=" + menu_id + ", restaurant_id=" + restaurant_id + ", menuName=" + menuName + ", price="
				+ price + ", description=" + description + ", imgpath=" + imgpath + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	
	 
	
}
