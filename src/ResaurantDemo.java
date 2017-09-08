
import com.restaurant.items.Category;
import com.restaurant.items.Coffee;
import com.restaurant.items.ColdDrink;
import com.restaurant.items.HotDrink;
import com.restaurant.items.Juice;
import com.restaurant.items.Sandwich;
import com.restaurant.items.Tea;
import com.restaurant.items.nonvegitems.NonVegSandwich;
import com.restaurant.items.vegitems.VegSandwich;
import com.restaurant.menu.Menu;
import com.restaurant.orders.PlaceOrder;

public class ResaurantDemo {
	public static void main(String[] args) {

		Menu menu = new Menu();
		HotDrink hotdrink = new Tea("Green Tea", 3, 2);											
		ColdDrink coldDrink = new Juice("Apple Juice", 5, 1);
		HotDrink coffee = new Coffee("Espresso", 2, 1);
		Sandwich vegSandwich = new VegSandwich("Veg", 6, 1);
		Sandwich meat = new NonVegSandwich("Meat", 8, 1);

		menu.addItem(coldDrink);
		menu.addItem(hotdrink);
		menu.addItem(coffee);
		menu.addItem(vegSandwich);
		menu.addItem(meat);
		
		PlaceOrder pO = new PlaceOrder(menu);
		pO.orderItem("Espresso", 1);
		
		pO.orderItem("Meat", 1);
		pO.orderItem("Veg", 1);
		pO.orderItem("Apple Juice", 1);
		
		System.out.println(pO.getBill());
		
			
	}
}
