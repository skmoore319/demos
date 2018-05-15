package com.revature.day2.launchers;

import com.revature.day1.objects.Food;

public class ScopeLauncher {
	
	public static void main(String[] args) {
		System.out.println("number of food items created = " + Food.numberOfFoodCreated);
		
		Food cheesecake = new Food(50, "Oreo Cheesecake", 200, 10);
//		Food pizza = new Food(1, "Ultimate Cheese", 1, 4);
		Food pizza = new Food();
		pizza.setName("Ultimate Cheese");
		System.out.println(cheesecake.getName());
		System.out.println(pizza.getName());
		System.out.println(pizza);
		
		System.out.println("number of food items created = " + cheesecake.numberOfFoodCreated);
		blockScopeTest();
	}
	
	public static void blockScopeTest() {
		{
			int i = 5;
			System.out.println(i);
		}
		
		if(true) { // i is only available within this block
			int i = 5;
			System.out.println(i);
		}
		
		while(true) {
			int i = 5;
			System.out.println(i);
		}
		// i is not available out here
	}

}
