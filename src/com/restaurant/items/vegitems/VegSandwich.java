package com.restaurant.items.vegitems;

import com.restaurant.items.Category;
import com.restaurant.items.Sandwich;
import com.restaurant.items.container.Container;

public class VegSandwich extends Sandwich{

	public VegSandwich(String name, double cost, int quantity) {
		super(name, cost, quantity);
	}

	@Override
	public Category getCategory() {
		return  Category.MAINCOURSE;
	}

	@Override
	public Container getContainer() {
		return null;
	}	

}
