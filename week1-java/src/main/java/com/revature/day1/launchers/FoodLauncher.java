package com.revature.day1.launchers;

import com.revature.day1.objects.Food;

public class FoodLauncher {

	public static void main(String[] args) {
		Food cheesecake = new Food(50, "Oreo Cheesecake", 200, 10);
		// Food pizza = new Food(1, "Ultimate Cheese", 1, 4);
		Food pizza = new Food();
		pizza.setName("Ultimate Cheese");
		System.out.println(cheesecake.getName());
		System.out.println(pizza.getName());
		System.out.println(pizza);
	}
}
