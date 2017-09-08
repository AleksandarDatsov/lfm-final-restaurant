package com.restaurant.items;

import com.restaurant.items.container.Container;

public abstract class HotDrink implements Item {

	private String name;
	private double cost;
	private int quantity;

	public HotDrink(String name) {
		setName(name);
	}

	public HotDrink(String name, double cost, int quantity) {
		setName(name);
		setCost(cost);
		setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		if (cost >= DEFAULT_COST) {
			this.cost = cost;
		} else {
			this.cost = DEFAULT_COST;
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public Category getCategory() {
		return Category.DRINKS;
	}

	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return getName() + " Cost: " + getCost() + " Quantity: " + getQuantity();
	}
}
