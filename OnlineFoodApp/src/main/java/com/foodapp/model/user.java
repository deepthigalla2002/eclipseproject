package com.foodapp.model;

public class user {
	private int user_id;
	private String username;
	private String email;
	private String phonenumber;
	private String password;
	private String address;
	
	
	public user() {
		super();
	}

	

	public user(int user_id, String username, String email, String phonenumber, String password, String address) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		this.address = address;
	}



	public user(String username, String email, String phonenumber, String password, String address) {
		super();
		this.username = username;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
		this.address = address;
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}



	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", username=" + username + ", email=" + email + ", phonenumber="
				+ phonenumber + ", password=" + password + ", address=" + address + "]";
	}
	
	

}
	
