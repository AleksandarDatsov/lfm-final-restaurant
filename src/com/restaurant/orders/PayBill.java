package com.restaurant.orders;

import java.util.ArrayList;

public class PayBill {

	public double payableAmount(PlaceOrder order){
		return sumToPay(order);
	}
	private double sumToPay(PlaceOrder order){
		double sum= 0;
		ArrayList<Order> o = order.getOrder();
		for (int i = 0; i < order.getOrder().size(); i++) {
			sum += o.get(i).getItem().getCost();
		}
		return sum;
	}
}
