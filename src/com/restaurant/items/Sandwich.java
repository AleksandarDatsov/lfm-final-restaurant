package com.restaurant.items;

public abstract class Sandwich implements Item {

	private String name;
	private double cost;
	private int quantity;

	public Sandwich(String name, double cost, int quantity) {
		setName(name);
		setCost(cost);
		setQuantity(quantity);
	}

	private void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "";
		}
	}

	@Override
	public String getName() {
		return this.name;
	}

	private void setCost(double cost) {
		if (cost >= DEFAULT_COST) {
			this.cost = cost;
		} else {
			this.cost = DEFAULT_COST;
		}
	}

	@Override
	public int getQuantity() {
		return this.quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		} else {
			this.quantity = DEFAULT_QUANTITY;
		}
	}

	@Override
	public double getCost() {
		return this.cost;
	}

	@Override
	public String toString() {
		return getName() + " Cost: " + getCost() + " Quantity: " + getQuantity();
	}

}
