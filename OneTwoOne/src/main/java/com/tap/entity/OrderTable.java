package com.tap.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OrderTable")
public class OrderTable {
	
	@Id
	@Column(name="oid")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int oid;
	@Column(name="itemname")
	private String itemname;
	@Column(name="price")
	private int price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_info")
	private Customer customer;
	
	public OrderTable(String itemname, int price) {
		super();
		this.itemname = itemname;
		this.price = price;
	}
	public OrderTable() {
		super();
	}
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderTable [oid=" + oid + ", itemname=" + itemname + ", price=" + price + "]";
	}
	
}
