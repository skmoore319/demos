package com.revature.day2.shops;

import com.revature.day2.beans.Pizza;
import com.revature.day2.beans.Sandwhich;

public class Subway implements SandwhichShop, PizzaShop {
	

	@Override
	public Sandwhich createSandwhich(String name) {
		switch (name) {
		case "BLT":
			return new Sandwhich(5, "BLT", 5, 6, "wheat", 5);
		default:
			return null;
		}
	}

	@Override
	public Pizza creatPizza(String name) {
		switch (name) {
		case "Boneless":
			return new Pizza(25, "Boneless", 8, 9, "BBQ");
		default:
			return null;
		}
	}
}
