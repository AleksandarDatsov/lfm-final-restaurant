package com.restaurant.items.nonvegitems;

import com.restaurant.items.Category;
import com.restaurant.items.Sandwich;
import com.restaurant.items.container.Container;

public class NonVegSandwich extends Sandwich{

	
	
	public NonVegSandwich(String name, double cost, int quantity) {
		super(name, cost, quantity);
	}

	@Override
	public Category getCategory() {
		// TODO Auto-generated method stub
		return Category.MAINCOURSE;
	}

	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return null;
	}


}
