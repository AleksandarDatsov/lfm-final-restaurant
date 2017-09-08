package com.restaurant.orders;

import java.util.ArrayList;
import com.restaurant.items.Item;
import com.restaurant.menu.Menu;

public class PlaceOrder {
	private ArrayList<Order> orders = new ArrayList<>();
	private ArrayList<Item> availableItems = new ArrayList<>();

	public PlaceOrder(Menu menu) {
		availableItems = menu.getItems();
	}

	public void orderItem(String item, int quantity) {
		for (int i = 0; i < availableItems.size(); i++) {
			if (item.equalsIgnoreCase(availableItems.get(i).getName())) {
				if (quantity <= availableItems.get(i).getQuantity()) {
					orders.add(new Order(availableItems.get(i), quantity));
					availableItems.get(i).setQuantity(availableItems.get(i).getQuantity() - quantity);
				}
			}
		}
	}

	public double getBill() {
		return new PayBill().payableAmount(this);
	}

	public ArrayList<Order> getOrder() {
		return orders;
	}
}
