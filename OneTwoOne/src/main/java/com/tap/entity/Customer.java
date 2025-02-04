package com.tap.entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="cid")
	private int cid;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private CustomerDetails cd;
	
	@OneToMany(mappedBy="customer")
	private List<OrderTable> orders;
	public Customer(int cid, String name) {
		super();
		this.cid = cid;
		this.name = name;
	}




	public Customer() {
		super();
	}




	public Customer(int cid, String name, CustomerDetails cd) {
		super();
		this.cid = cid;
		this.name = name;
		this.cd = cd;
	}



	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	public CustomerDetails getCd() {
		return cd;
	}



	public void setCd(CustomerDetails cd) {
		this.cd = cd;
	}




	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", cd=" + cd + "]";
	}
	
	
	
}
