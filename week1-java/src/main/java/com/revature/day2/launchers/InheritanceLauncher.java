package com.revature.day2.launchers;

import com.revature.day1.objects.Food;
import com.revature.day2.beans.Sandwhich;

public class InheritanceLauncher {
	public static void main(String[] args) {
		
		Food f = new Food();
		Sandwhich ham = new Sandwhich("Rye", 4);
		System.out.println(ham);
		System.out.println(Food.numberOfFoodCreated);
		System.out.println(Sandwhich.numberOfFoodCreated);
	}
}
