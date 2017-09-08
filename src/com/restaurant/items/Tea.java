package com.restaurant.items;

public class Tea extends HotDrink{
	
	public Tea(String name){
		super(name);
	}
	
	public Tea(String name, double cost, int quantity) {
		super(name, cost, quantity);
	}
	
	@Override
	public int getQuantity() {
		return super.getQuantity();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost();
	}


}
