package com.foodapp.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	private Map<Integer,CartItem> items;
	
	public Cart()
	{
		this.items=new HashMap<>();
	}
	
	public void addItem(CartItem item)
	{
		int itemid=item.getItem_id();
		
		if(items.containsKey(itemid))
		{
			CartItem existingitem=items.get(itemid);
			existingitem.setQuantity(existingitem.getQuantity()+item.getQuantity());
//	   	   System.out.println("Updated item: " + existingitem.getName() + ", Quantity: " + existingitem.getQuantity());

		}
		else
		{
			items.put(itemid, item);
//	        System.out.println("Added item: " + item.getName());

		}
	}
	
	public void updateItem(int itemid,int quantity)
	{
		if(items.containsKey(itemid))
		{
			if(quantity<=0)
			{
				items.remove(itemid);
			}
			else
			{
				items.get(itemid).setQuantity(quantity);
			}
		}
	}
	
	public void removeItem(int itemid)
	{
		items.remove(itemid);
	}
	
	public Map<Integer,CartItem> getAll()
	{
		return items;
	}
	
	public void clearCart(int itemid)
	{
		items.clear();
	}
}
