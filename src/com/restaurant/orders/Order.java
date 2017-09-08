package com.restaurant.orders;

import com.restaurant.items.Item;

public class Order {
	private String name;
	private Item item;
	public Order(Item item, int quantity) {
		this.setItem(item);
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			name = "";
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity != 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	private int quantity;

}
