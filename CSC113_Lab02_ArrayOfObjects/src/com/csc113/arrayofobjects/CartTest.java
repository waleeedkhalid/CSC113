package com.csc113.arrayofobjects;

public class CartTest {
	public static void main(String[] args) {
//		 Create a cart of size 20
		Cart WeekendShopping = new Cart(20);
//		 Create three items (see sample run)
		Item Chicken = new Item("Chicken", 19.25);
		Item Bread = new Item("Bread", 1.25);
		Item Water = new Item("Water", 1);
//		 Add those items to the cart
		WeekendShopping.addItem(Chicken);
		WeekendShopping.addItem(Bread);
		WeekendShopping.addItem(Water);
//		 Print the cart and its total
		System.out.println(WeekendShopping.toString());
		System.out.println(WeekendShopping.getTotal());		
//		 Modify the price of one of the items
		Chicken.setPrice(25);
//		 Print the cart and its total
		System.out.println(WeekendShopping.toString());
		System.out.println(WeekendShopping.getTotal());		
	}
}
