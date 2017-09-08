package com.restaurant.menu;

import java.util.ArrayList;

import com.restaurant.items.Item;

public class Menu {
	private Item item;
	private ArrayList<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		if (item != null) {
			items.add(item);
		}
	}

	public String displayItem() {
		StringBuilder sb = new StringBuilder();
		for (Item item : items) {
			sb.append(item + "\n");
		}
		return sb.toString();
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void removeItem(Item item) {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).equals(item)) {
				items.remove(i);
				return;
			}
		}
	}

}
