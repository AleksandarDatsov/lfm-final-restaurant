package com.restaurant.items;

import com.restaurant.items.container.Container;

public interface Item {
	public static final double DEFAULT_COST = 0.0;
	public static final int DEFAULT_QUANTITY = 0;

	public abstract int getQuantity();
	public abstract void setQuantity(int quantity);
	public abstract Category getCategory();
	public abstract double getCost();
	public abstract Container getContainer();
	public abstract String getName();
}
