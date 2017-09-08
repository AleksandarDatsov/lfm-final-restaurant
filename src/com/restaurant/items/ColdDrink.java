package com.restaurant.items;

import com.restaurant.items.container.Container;

public abstract class ColdDrink implements Item {
	private String name;
	private double cost;
	private int quantity;

	public ColdDrink(String name, double cost, int quantity) {
		setName(name);
		setCost(cost);
		setQuantity(quantity);
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "";
		}
	}

	public void setCost(double cost) {
		if (cost >= DEFAULT_COST) {
			this.cost = cost;
		} else {
			this.cost = DEFAULT_COST;
		}
	}

	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public Category getCategory() {
		return Category.DRINKS;
	}
	@Override
	public Container getContainer() {
		return null;
	}
	@Override
	public void setQuantity(int quantity) {
		if(quantity > DEFAULT_QUANTITY){
		this.quantity = quantity;
		}else{
			this.quantity = DEFAULT_QUANTITY;
		}
	}

	@Override
	public int getQuantity() {
		return this.quantity;
	}
	@Override
	public String toString() {
		return getName() + " Cost: " + getCost() + " Quantity: " + getQuantity();
	}
}
